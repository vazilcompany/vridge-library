package com.vazil.noti.aspect;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;

@Aspect
@Log4j2
@AutoConfigurationPackage
@AllArgsConstructor
public class NotificationAspect {

    @Around("@annotation(com.vazil.noti.annotation.Notification)")
    public Object NotificationAround(ProceedingJoinPoint pjp) throws Throwable {


        Object proceed = pjp.proceed();
        log.info("안녕하세요 aspect가 되는지 확인할려고 합니다.");


        return proceed;
    }
}
