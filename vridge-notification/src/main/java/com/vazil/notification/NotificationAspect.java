package com.vazil.notification;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Log4j2
public class NotificationAspect {


    @Around("@annotation(com.vazil.notification.annotation.Notification)")
    public Object notificationSender(ProceedingJoinPoint point) throws Throwable {
        Object proceed = point.proceed();

        log.info("안녕하세요!");

        return proceed;

    }
}
