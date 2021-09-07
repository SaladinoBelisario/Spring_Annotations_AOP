package com.example.demo;

import com.example.aopdemo.dao.AccountDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {
    public static void main(String[] args) {
        // read spring java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DemoConfig.class);

        // get the bean from spring container
        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);

        // call the business method
        accountDAO.addAccount();

        // do it again!
        System.out.println("\nlet's call it again!\n");

        // call the business method again
        accountDAO.addAccount();

        // close the spring context
        context.close();
    }
}
