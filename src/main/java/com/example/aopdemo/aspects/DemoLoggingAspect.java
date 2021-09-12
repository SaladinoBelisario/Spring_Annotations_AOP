package com.example.aopdemo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoLoggingAspect {
    // here we add the related advices for logging
    // e.g. @Before advice
    // @Before("execution(public void add*())")
    // @Before("execution(public * add*(com.example.aopdemo.Account, ..))")
    // @Before("execution(public void addAccount())")
    // @Before("execution(public void com.example.aopdemo.dao.AccountDAO.addAccount())")
    // @Before("execution(public void updateAccount())")
    @Order(2)
    @Before("com.example.aopdemo.aspects.AOPExpressions.forDAOPackageNotGetterSetter()")
    public void beforeAddAccountAdvice() {
        System.out.println("\n=====>>> Executing @Before advice on method");
    }
}
