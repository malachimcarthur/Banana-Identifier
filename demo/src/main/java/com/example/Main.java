package com.example;

public class Main {
    public static void main(String[] args) {
        Banana b = new Banana(0,3);
		b.Volume();
		b.microsivertsPerInch();
        System.out.printf("Ounces: %.2f\nMicrosiverts: %.2f",b.toOunce(), b.microsivertsPerInch());
    }
}