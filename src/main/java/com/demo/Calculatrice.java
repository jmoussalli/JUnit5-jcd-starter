package com.demo;

public class Calculatrice {
    public static int additionner(int a, int b) {
        return a + b;
    }

    public int soustraire(int a, int b) {
        return a - b;
    }

    public int multiplier(int a, int b) {
        return a * b;
    }

    public int diviser(int a, int b) {
        return b==0?0:a / b;
    }

}
