package com.example;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.add(5, 7);
        System.out.println("Sum: " + sum);
    }
}
