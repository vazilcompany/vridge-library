package com.vazil.notification;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.*;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.client.RestTemplate;

import javax.mail.internet.MimeMessage;

@Log4j2
public class NotiService {

    private final JavaMailSender javaMailSender;

    public NotiService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }


    /**
     * Sends a payload to the specified request URL using RestTemplate.
     *
     * @param requestUrl The URL to send the payload to.
     * @param jsonString The payload to send in JSON format.
     */
    public void sendPayload(String requestUrl, String jsonString) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<String> request = new HttpEntity<>(jsonString, headers);

        try {
            ResponseEntity<String> response = restTemplate.postForEntity(requestUrl, request, String.class);
            if (response.getStatusCode() == HttpStatus.OK) {
                log.info("Payload sent successfully!");

            } else {
                log.info("Error sending payload: " + response.getStatusCode());

            }
        } catch (Exception e) {
            log.info("Exception caught while sending payload: " + e.getMessage());

        }
    }




    /**
     * Sends a notification using the specified NotiType.
     *
     * @param recipient The recipient of the notification.
     * @param subject The subject of the notification.
     * @param contents The contents of the notification.
     */
    public void sendEmail(String recipient, String subject, String contents)  {
        try {
            MimeMessage message = javaMailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(message, true, "UTF-8");
            mimeMessageHelper.setFrom("tester@test.com", "브릿지 AI");
            mimeMessageHelper.setTo(recipient);
            mimeMessageHelper.setSubject(subject);
            mimeMessageHelper.setText(contents, true);
            javaMailSender.send(message);

            log.info("Email sent successfully!");
        } catch (Exception e) {
            log.info("Exception caught while sending email: " + e.getMessage());
        }
    }

}
