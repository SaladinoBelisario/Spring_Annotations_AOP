package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {
        //use Java configuration class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        //get the bean from container
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

        //call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        //call method for daily fortune
        System.out.println(theCoach.getDailyFortune());

        //call methods from swimCoach
        System.out.println("email: " + theCoach.getEmail());
        System.out.println("team: " + theCoach.getTeam());

        //close the context
        context.close();
    }
}
