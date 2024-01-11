package com.example.patternsexamples.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.ConcurrentMap;

@Setter
@Getter
@AllArgsConstructor
public class Passenger {
    private final OpenDoorsCommand openDoorsCommand;
    private final CloseDoorsCommand closeDoorsCommand;

    public void pressOpenDoorsButton() {
        openDoorsCommand.execute();
    }

    public void pressCloseDoorsButton() {
        closeDoorsCommand.execute();
    }
}
