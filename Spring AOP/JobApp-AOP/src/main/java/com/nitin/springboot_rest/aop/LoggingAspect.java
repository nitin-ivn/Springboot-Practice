package com.nitin.springboot_rest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* com.nitin.springboot_rest.service.JobService.*(..))")
    public void legMethodCall(JoinPoint jp){
        LOGGER.info("Method called " + jp.getSignature().getName());
    }

    @After("execution(* com.nitin.springboot_rest.service.JobService.*(..))")
    public void legMethodExecuted(JoinPoint jp){
        LOGGER.info("Method Executed " + jp.getSignature().getName());
    }

    @AfterThrowing("execution(* com.nitin.springboot_rest.service.JobService.*(..))")
    public void legMethodCallError(JoinPoint jp){
        LOGGER.info("Method has issues " + jp.getSignature().getName());
    }

    @AfterReturning("execution(* com.nitin.springboot_rest.service.JobService.*(..))")
    public void legMethodCallExecutedSuccessfully(JoinPoint jp){
        LOGGER.info("Method Executed Successfully " + jp.getSignature().getName());
    }
}
