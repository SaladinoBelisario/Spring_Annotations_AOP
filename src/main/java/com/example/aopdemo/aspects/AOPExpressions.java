package com.example.aopdemo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AOPExpressions {
    // Using a pointcut declaration first
    @Pointcut("execution(* com.example.aopdemo.dao.*.*(..))")
    public void forDAOPackage(){}

    // create a pointcut for getter methods
    @Pointcut("execution(* com.example.aopdemo.dao.*.get*(..))")
    public void getter(){}

    // create a pointcut for setter methods
    @Pointcut("execution(* com.example.aopdemo.dao.*.set*(..))")
    public void setter(){}

    // combined pointcuts to exclude getters and setters
    @Pointcut("forDAOPackage() && !(getter() || setter())")
    public void forDAOPackageNotGetterSetter() {}
}
