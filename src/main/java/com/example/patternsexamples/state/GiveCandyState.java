package com.example.patternsexamples.state;

public class GiveCandyState implements MachineState{
    @Override
    public void doAction(CandyMachine candyMachine) {
        System.out.println("Giving candy");
        candyMachine.setState(new WaitForCoinState());
    }
}
