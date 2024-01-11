package com.example.patternsexamples.strategy;

public class DBRepository implements Repository{
    @Override
    public void read() {
        System.out.println("Reading from DB Repository...");
    }
}
