package com.vazil.notification.config;

import com.vazil.notification.NotiService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;

@Configuration
public class NotiServiceConfiguration {

    @Bean
    public NotiService notiService(JavaMailSender javaMailSender) {
        return new NotiService(javaMailSender);
    }

}
