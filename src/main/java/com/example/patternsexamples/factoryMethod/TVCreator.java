package com.example.patternsexamples.factoryMethod;

public class TVCreator implements TechniqueCreator {
    @Override
    public Technique createTechnique() {
        return new TV();
    }
}
