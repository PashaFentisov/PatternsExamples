package com.example.patternsexamples.observer;

import java.util.ArrayList;
import java.util.List;

public class Djinni implements Publisher{
    private final List<Subscriber> subscribers = new ArrayList<>();
    private final List<String> javaVacancies = new ArrayList<>();
    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void addSubscribers(List<Subscriber> subscribers){
        subscribers.forEach(this::addSubscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String vacancy) {
        subscribers.forEach(subscriber -> subscriber.showNotification("Here is new vacancy: " + vacancy + " on Djinni"));
    }

    @Override
    public void postVacancy(String vacancy){
        javaVacancies.add(vacancy);
        notifySubscribers(vacancy);
    }
}
