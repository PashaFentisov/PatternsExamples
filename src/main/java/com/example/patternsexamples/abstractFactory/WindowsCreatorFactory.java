package com.example.patternsexamples.abstractFactory;

public class WindowsCreatorFactory implements TechniqueCreatorFactory{

    @Override
    public Phone createPhone() {
        return new WindowsPhone();
    }

    @Override
    public Laptop createLaptop() {
        return new WindowsLaptop();
    }
}
