package com.vazil.notification;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.*;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.mail.internet.MimeMessage;
import java.io.IOException;

@Service
@Log4j2
public class VridgeNotify {

    @Autowired
    private JavaMailSenderImpl javaMailSender;
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private Environment env;

    /**
     * Sends a payload to the specified request URL using RestTemplate.
     *
     * @param webhookUrl The URL to send the payload to.
     * @param payload    The payload to send in JSON format.
     */
    @Async
    public void sendPayload(String webhookUrl, String payload) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.set(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
            HttpEntity<String> request = new HttpEntity<>(payload, headers);

            ResponseEntity<String> response = restTemplate.postForEntity(webhookUrl, request, String.class);
            if (response.getStatusCode() == HttpStatus.OK) {
                log.info("Payload sent successfully!");
            } else {
                log.info("Error sending payload: " + response.getStatusCode());
            }
        } catch (Exception e) {
            log.info("Exception caught while sending payload: ", e);
        }
    }

    /**
     * Sends a notification using the specified NotiType.
     *
     * @param recipient The recipient of the notification.
     * @param subject   The subject of the notification.
     * @param contents  The contents of the notification.
     */
    @Async
    public void sendEmail(String recipient, String subject, String contents) {
        try {
            String fromEmail = env.getProperty("spring.mail.properties.mail.from.email");
            String fromPersonal = env.getProperty("spring.mail.properties.mail.from.personal");

            MimeMessage message = javaMailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(message, true, "UTF-8");
            if (fromEmail != null) {
                mimeMessageHelper.setFrom(fromEmail, fromPersonal);
            }
            mimeMessageHelper.setTo(recipient);
            mimeMessageHelper.setSubject(subject);
            mimeMessageHelper.setText(contents, true);
            javaMailSender.send(message);

            log.info("Email sent successfully!");
        } catch (Exception e) {
            log.info("Exception caught while sending email", e);
        }
    }
}
