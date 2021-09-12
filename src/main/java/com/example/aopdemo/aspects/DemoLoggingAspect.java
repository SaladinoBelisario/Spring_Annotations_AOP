package com.example.aopdemo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoLoggingAspect {
    // Using a pointcut declaration first
    @Pointcut("execution(* com.example.aopdemo.dao.*.*(..))")
    public void forDAOPackage(){}

    // here we add the related advices for logging
    // e.g. @Before advice
    // @Before("execution(public void add*())")
    // @Before("execution(public * add*(com.example.aopdemo.Account, ..))")
    // @Before("execution(public void addAccount())")
    // @Before("execution(public void com.example.aopdemo.dao.AccountDAO.addAccount())")
    // @Before("execution(public void updateAccount())")
    @Before("forDAOPackage()")
    public void beforeAddAccountAdvice() {
        System.out.println("\n=====>>> Executing @Before advice on method");
    }

    @Before("forDAOPackage()")
    public void performAPIAnalytics() {
        System.out.println("\n=====>>> Performing API analytics");
    }
}
