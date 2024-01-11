package com.example.patternsexamples.decorator;

public class Driver extends JobDecorator{

    public Driver(Job job) {
        super(job);
    }
    @Override
    public void doJob() {
        super.doJob();
        System.out.println("Driving...");
    }
}
