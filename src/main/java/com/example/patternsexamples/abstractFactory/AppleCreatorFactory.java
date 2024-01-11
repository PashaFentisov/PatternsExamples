package com.example.patternsexamples.abstractFactory;

public class AppleCreatorFactory implements TechniqueCreatorFactory{
    @Override
    public Phone createPhone() {
        return new ApplePhone();
    }

    @Override
    public Laptop createLaptop() {
        return new AppleLaptop();
    }
}
