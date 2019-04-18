package com.myname.calculator;
import org.springframework.stereotype.Service;
/**
 * This is Test Sample.
 */
@Service
public class Calculator {
    /**
     * 
     * @param a First Parameter (int).
     * @param b Second Parameter (int).
     * @return Result (int).
     */
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