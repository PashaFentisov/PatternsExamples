package com.example.patternsexamples.observer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DjinniSubscriber implements Subscriber{
    private String name;
    @Override
    public void showNotification(String message) {
        System.out.println(name + " here is your message " +message);
    }
}
