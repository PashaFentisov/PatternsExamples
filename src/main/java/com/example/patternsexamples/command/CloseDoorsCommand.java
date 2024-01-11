package com.example.patternsexamples.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CloseDoorsCommand implements Command{
    private Elevator elevator;
    @Override
    public void execute() {
        elevator.closeDoors();
    }
}
