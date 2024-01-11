package com.example.patternsexamples.decorator;

public class Teacher implements Job{
    @Override
    public void doJob() {
        System.out.println("Teaching...");
    }
}
