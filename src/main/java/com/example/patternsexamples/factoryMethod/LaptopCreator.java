package com.example.patternsexamples.factoryMethod;

public class LaptopCreator implements TechniqueCreator {
    @Override
    public Technique createTechnique() {
        return new Laptop();
    }
}
