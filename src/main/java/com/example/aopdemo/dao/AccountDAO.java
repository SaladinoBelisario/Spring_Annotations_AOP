package com.example.aopdemo.dao;

import com.example.aopdemo.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
    private String name = "AccountDAO";
    private Long serviceCode = 5L;

    public void getServiceCode() {
        System.out.println(serviceCode.toString());
    }

    public void setServiceCode(Long serviceCode) {
        this.serviceCode = serviceCode;
    }

    public void getName() {
        System.out.println(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addAccount(Account account){
        System.out.println(getClass() + "Doing DB work for adding account");
    }
}
