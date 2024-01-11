package com.example.patternsexamples.elevator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ButtonImpl implements Button{
    private final IElevator elevator;

    @Override
    public void pressButton(int floor) {
        System.out.println("Button was pressed on " + floor + " floor");
        System.out.println("elevator is on the " + elevator.getBaseFloor());
        elevator.run(floor);
    }
}
