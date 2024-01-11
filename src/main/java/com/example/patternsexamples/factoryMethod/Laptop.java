package com.example.patternsexamples.factoryMethod;

public class Laptop implements Technique{
    @Override
    public void turnOn() {
        System.out.println("Laptop is turned on");
    }
}
