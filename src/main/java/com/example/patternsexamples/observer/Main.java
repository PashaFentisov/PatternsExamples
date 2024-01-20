package com.example.patternsexamples.observer;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Publisher djinni = new Djinni();
        Subscriber subscriber1 = new DjinniSubscriber("Pasha");
        Subscriber subscriber2 = new DjinniSubscriber("Vasya");
        Subscriber subscriber3 = new DjinniSubscriber("Kolya");
        djinni.addSubscribers(List.of(subscriber1, subscriber2, subscriber3));
        djinni.postVacancy("Java Developer");
        System.out.println("=================================");
        djinni.postVacancy("Java Middle Developer");
    }
}
