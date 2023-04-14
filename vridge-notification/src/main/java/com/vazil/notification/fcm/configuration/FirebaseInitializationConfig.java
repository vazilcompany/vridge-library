package com.vazil.notification.fcm.configuration;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;

@Configuration
public class FirebaseInitializationConfig {

    @Value("${gcp.firebase.service-account}")
    private Resource serviceAccount;

    @PostConstruct
    public void initializeFirebase() throws IOException {
        InputStream inputStream = serviceAccount.getInputStream();
        FirebaseOptions options = FirebaseOptions.builder()
                .setCredentials(GoogleCredentials.fromStream(inputStream))
                .build();
        FirebaseApp.initializeApp(options);
    }
}
