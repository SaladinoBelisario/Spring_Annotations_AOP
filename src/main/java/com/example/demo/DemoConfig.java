package com.example.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@EnableAspectJAutoProxy
@ComponentScan("com.example.aopdemo")
public class DemoConfig {
}
