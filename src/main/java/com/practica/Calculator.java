package com.practica;

public class Calculator {

    public int divide(int a, int b) {
        return a / b;
    }

    public String status(int val) {
        String s = null;
        if (val > 0) s = "positive";
        return s.toUpperCase(); 
    }

    private void unused() {
        System.out.println("");
    }
}
