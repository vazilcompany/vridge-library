package com.vazil.notification.aspect;

import com.vazil.notification.service.NotiService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class NotificationAspect {

    private static final Log log = LogFactory.getLog(NotiService.class);

    @Around("@annotation(com.vazil.notification.annotation.Notification)")
    public Object notificationSender(ProceedingJoinPoint point) throws Throwable {
        Object proceed = point.proceed();

        log.info("안녕하세요!");

        return proceed;

    }
}
