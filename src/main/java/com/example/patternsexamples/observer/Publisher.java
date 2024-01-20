package com.example.patternsexamples.observer;

import java.util.List;

public interface Publisher {
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifySubscribers(String vacancy);

    void addSubscribers(List<Subscriber> subscribers);

    void postVacancy(String vacancy);
}
