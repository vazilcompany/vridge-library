package com.vazil.noti;


import lombok.extern.log4j.Log4j2;
import org.springframework.http.*;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;

@Log4j2
public class Notification {

    private final JavaMailSender javaMailSender;

    public Notification(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    /**
     * 기본적인 호출
     * @param requestUrl 발신할 url 주소
     * @param message 메세지 내용
     */
    public void sendPayload(String requestUrl, String message) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<String> entity = new HttpEntity<>(message, headers);

        try {
            ResponseEntity<String> response = restTemplate.postForEntity(requestUrl, entity, String.class);
            HttpStatus statusCode = response.getStatusCode();
            if (statusCode == HttpStatus.OK) {
                log.info("HTTP request succeeded with status code {} and response body: {}", statusCode, response.getBody());
            } else {
                log.error("HTTP request failed with status code {}", statusCode);
            }
        } catch (Exception e) {
            log.error("Exception occurred: {}", e.getMessage(), e);
        }
    }

    /**
     * JavaMailSender를 사용한 이메일 전송
     * application.properties(yml) 작성하여 메일 서버 정보를 설정해야한다.
     * @param recipient 수신자
     * @param subject 이메일 제목
     * @param message 이메일 내용
     * @param from 발신자 이메일
     * @param personal 발신자 이름
     */
    @Async
    public void sendEmail(String recipient, String subject, String message, String from, String personal) {
        MimeMessage mimeMailMessage = javaMailSender.createMimeMessage();
        try {
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMailMessage, true, "UTF-8");
            mimeMessageHelper.setFrom(from, personal);
            mimeMessageHelper.setTo(recipient);
            mimeMessageHelper.setSubject(subject);
            mimeMessageHelper.setText(message, true);
            javaMailSender.send(mimeMailMessage);
            log.info("Email sent successfully to {}", recipient);
        } catch (MessagingException e) {
            log.error("Error occurred while creating or sending email: {}", e.getMessage());
        } catch (UnsupportedEncodingException e) {
            log.error("Error occurred while setting message body encoding for sending email: {}", e.getMessage());
        }catch (MailException e) {
            log.error("Error occurred while sending email: {}", e.getMessage());
        } catch (Exception e) {
            log.error("Unexpected error occurred while sending email: {}", e.getMessage());
        }
    }

}
