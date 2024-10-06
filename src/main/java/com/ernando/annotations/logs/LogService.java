package com.ernando.annotations.logs;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogService {

    @Around("@annotation(MyLog)")
    public Object automaticLogs(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Starting method: " + joinPoint.getSignature());
        Object result = joinPoint.proceed();
        System.out.println("Finished method: " + joinPoint.getSignature());
        return result;
    }
    
}
