package com.example.patternsexamples.command;

public class Elevator implements ElevatorActions{
    @Override
    public void openDoors() {
        System.out.println("Elevator is opening doors");
    }

    @Override
    public void closeDoors() {
        System.out.println("Elevator is closing doors");
    }
}
