package com.example.patternsexamples.elevator;

public class Main {
    public static void main(String[] args) {
        IElevator elevator = new Elevator();
        Button button = new ButtonImpl(elevator);
        button.pressButton(3);//finish
    }
}
