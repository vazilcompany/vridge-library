package com.vazil.notification.config;

import com.vazil.notification.NotiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.client.RestTemplate;

import java.util.Properties;

@Configuration
public class NotiServiceConfiguration {


    @Bean
    public NotiService notiService(JavaMailSender javaMailSender) {
        return new NotiService(javaMailSender);
    }

}
