package com.medical_service.compenent;


import org.springframework.stereotype.Component;

@Component
public class SimpleMath {
    
    public int add(int a, int b) {
        return a + b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }
    
    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}