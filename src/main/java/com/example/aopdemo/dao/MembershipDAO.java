package com.example.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
    public void addAccount(){
        System.out.println(getClass() + "Doing DB work for adding a Membership");
    }

    public boolean addSillyMember(){
        System.out.println(getClass() + "Doing DB work for adding a Membership");
        return true;
    }
}
