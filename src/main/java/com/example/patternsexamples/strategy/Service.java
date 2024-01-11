package com.example.patternsexamples.strategy;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Service {
    private Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public void read() {
        repository.read();
    }
}
