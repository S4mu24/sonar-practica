package com.practica;

public class Calculator {

    // Bug 1 corregido
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("El divisor no puede ser cero.");
        }
        return a / b;
    }

    // Bug 2 corregido
    public String status(int val) {
        String s;
        if (val > 0) {
            s = "positive";
        } else {
            s = "negative or zero";
        }
        return s.toUpperCase(); 
    }

    // Code smell corregido
}
