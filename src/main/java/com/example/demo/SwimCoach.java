package com.example.demo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach{
    private FortuneService fortuneService;

    @Value("${foo.email}")
    private String email;
    @Value("${foo.team}")
    private String team;

    public SwimCoach(FortuneService service){
        this.fortuneService = service;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 200 meters";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
