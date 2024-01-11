package com.example.patternsexamples.elevator;

public interface IElevator {
    int getBaseFloor();

    void openDoor();

    void closeDoor();

    void run(int floor);
}
