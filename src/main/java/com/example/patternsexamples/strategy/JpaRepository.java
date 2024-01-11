package com.example.patternsexamples.strategy;

public class JpaRepository implements Repository{
    @Override
    public void read() {
        System.out.println("Reading from Jpa Repository...");
    }
}
