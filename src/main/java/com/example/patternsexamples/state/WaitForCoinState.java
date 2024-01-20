package com.example.patternsexamples.state;

public class WaitForCoinState implements MachineState{
    @Override
    public void doAction(CandyMachine candyMachine){
        System.out.println("Waiting for coin");
        candyMachine.setState(new GiveCandyState());
    }
}
