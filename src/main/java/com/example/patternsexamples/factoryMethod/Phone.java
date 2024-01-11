package com.example.patternsexamples.factoryMethod;

public class Phone implements Technique{
    @Override
    public void turnOn() {
        System.out.println("Phone is turned on");
    }
}
