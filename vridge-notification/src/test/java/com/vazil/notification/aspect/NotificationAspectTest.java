package com.vazil.notification.aspect;

import com.vazil.notification.annotation.Notification;
import org.aspectj.lang.ProceedingJoinPoint;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class NotificationAspectTest {

    @Test
    void notificationSenderTest() throws Throwable {
        ProceedingJoinPoint point = Mockito.mock(ProceedingJoinPoint.class);

        String returnValue = "Hello, world!";
        Mockito.when(point.proceed()).thenReturn(returnValue);

        NotificationAspect aspect = new NotificationAspect();

        Object result = aspect.notificationSender(point);

        Mockito.verify(point).proceed();
        assertEquals(returnValue, result);


    }
}
