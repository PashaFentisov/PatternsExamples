package com.example.patternsexamples.state;

public class Main {
    public static void main(String[] args) {
        CandyMachine candyMachine = new CandyMachine();
        for (int i = 0; i < 5; i++) {
            candyMachine.giveCandy();
            System.out.println("=================================");
        }
    }
}
