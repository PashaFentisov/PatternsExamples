package com.example.patternsexamples.state;

public class CandyMachine {
    private MachineState state;

    public CandyMachine() {
        state = new WaitForCoinState();
    }

    public void setState(MachineState state) {
        this.state = state;
    }

    public void giveCandy() {
        state.doAction(this);
    }
}
