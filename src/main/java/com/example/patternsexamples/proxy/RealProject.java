package com.example.patternsexamples.proxy;

public class RealProject implements Project{
    @Override
    public void start() {
        System.out.println("Real Project is started");
    }
}
