package com.example.patternsexamples.decorator;

public class Cook extends JobDecorator{

    public Cook(Job job) {
        super(job);
    }
    @Override
    public void doJob() {
        super.doJob();
        System.out.println("Cooking...");
    }
}
