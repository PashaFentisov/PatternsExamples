package com.example.patternsexamples.strategy;

public class JavaRepository implements Repository{
    @Override
    public void read() {
        System.out.println("Reading from Java Repository...");
    }
}
