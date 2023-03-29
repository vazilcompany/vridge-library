package com.vazil.notification.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class NotificationAspect {

    @Pointcut("@annotation(com.vazil.notification.annotation.Notification)")
    public void notificationAnnotationPointcut() {
    }

    @Around("notificationAnnotationPointcut()")
    public Object notificationAround(ProceedingJoinPoint pjp) throws Throwable {
        Object proceed = pjp.proceed();

        System.out.println("gogogo hi");

        return proceed;
    }
}
