package com.example.patternsexamples.factoryMethod;

public class PhoneCreator implements TechniqueCreator{
    @Override
    public Technique createTechnique() {
        return new Phone();
    }
}
