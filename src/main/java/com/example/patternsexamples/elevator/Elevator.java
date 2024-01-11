package com.example.patternsexamples.elevator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Elevator implements IElevator {
    private int floor = 1;

    @Override
    public int getBaseFloor() {
        return floor;
    }

    @Override
    public void openDoor() {
        System.out.println("open door");
    }

    @Override
    public void closeDoor() {
        System.out.println("close door");
    }

    @Override
    public void run(int floor) {
        this.floor = floor;
        System.out.println("going to " + floor + " floor");
        openDoor();
        closeDoor();
    }
}
