package com.example.patternsexamples.factoryMethod;

public class TV implements Technique{
    @Override
    public void turnOn() {
        System.out.println("TV is turned on");
    }
}
