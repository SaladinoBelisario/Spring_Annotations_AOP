package com.example.aopdemo.dao;

import com.example.aopdemo.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
    public void addAccount(Account account){
        System.out.println(getClass() + "Doing DB work for adding account");
    }
}
