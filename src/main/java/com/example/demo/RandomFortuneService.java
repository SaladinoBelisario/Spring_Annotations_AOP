package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{
    private String[] fortunes = {
            "Fortune random 1",
            "Fortune random 2",
            "Fortune random 3"
    };

    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        int index = myRandom.nextInt(fortunes.length);
        return fortunes[index];
    }
}
