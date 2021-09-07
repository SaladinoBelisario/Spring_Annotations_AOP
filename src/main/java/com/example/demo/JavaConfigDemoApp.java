package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {
        //use Java configuration class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        //get the bean from container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        //call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        //call method for daily fortune
        System.out.println(theCoach.getDailyFortune());

        //close the context
        context.close();
    }
}
