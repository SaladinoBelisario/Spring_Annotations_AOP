package com.example.aopdemo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Order(1)
    @Before("com.example.aopdemo.aspects.AOPExpressions.forDAOPackageNotGetterSetter()")
    public void logToCloudAsync() {
        System.out.println("\n=====>>> Logging to cloud...");
    }
}
