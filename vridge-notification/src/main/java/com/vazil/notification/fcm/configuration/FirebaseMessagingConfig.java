package com.vazil.notification.fcm.configuration;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.messaging.FirebaseMessaging;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;

@Configuration
public class FirebaseMessagingConfig {

    @Value("${gcp.firebase.service-account}")
    private Resource serviceAccount;

    @Bean
    FirebaseMessaging firebaseMessaging(FirebaseApp firebaseApp) {
        return FirebaseMessaging.getInstance(firebaseApp);
    }

    @Bean
    FirebaseApp firebaseApp(GoogleCredentials credentials) {
        FirebaseOptions options = FirebaseOptions.builder()
                .setCredentials(credentials)
                .build();

        return FirebaseApp.initializeApp(options);
    }

    @Bean
    GoogleCredentials googleCredentials() {
        try {
            if (serviceAccount != null) {
                try (InputStream is = serviceAccount.getInputStream()) {
                    return GoogleCredentials.fromStream(is);
                }
            } else {
                return GoogleCredentials.getApplicationDefault();
            }
        } catch (IOException ioe) {
            throw new RuntimeException(ioe);
        }
    }
}
