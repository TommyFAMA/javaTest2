package com.example;

public class Math {
    public int add(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {
        return a - b;   
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b){
        int c = 3; // dummy value
        if(b != 0 && c==3){
            return a/b;
        }
        return -999999999;
    }
}