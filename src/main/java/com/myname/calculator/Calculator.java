package com.myname.calculator;
import org.springframework.stereotype.Service;

@Service
public class Calculator {
    int sum (int a , int b) {
        return a + b;
    }

    int minus (int a , int b ){
        return a - b;
    }

    int cross (int a , int b ){
        return a * b;
    }

    int divide (int a , int b){
        return a / b;
    }
}