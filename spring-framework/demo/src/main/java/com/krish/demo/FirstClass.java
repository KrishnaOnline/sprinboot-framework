package com.krish.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
//@Service
public class FirstClass {
    private String myVar;

    public FirstClass(String myVar) {
        this.myVar = myVar;
    }

    public String sayHello() {
        return "Hello from FirstClass, myVar ==> "+myVar;
    }
}