package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach{

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService ;

    //define default constructor
    public TennisCoach(){
        System.out.println(">>TennisCoach: default constructor");
    }

    @PostConstruct
    public void doMyInit(){
        System.out.println("My Init method");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("My destroy method");
    }

    //define a setter method
    /*@Autowired
    public void setFortuneService(FortuneService service){
        System.out.println(">>TennisCoach: setter injection");
        fortuneService = service;
    }*/

    /*@Autowired
    public TennisCoach(FortuneService service){this.fortuneService = service;}*/

    @Override
    public String getDailyWorkout() {
        return "Practice with the ball";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
