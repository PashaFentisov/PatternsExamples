package com.example.patternsexamples.templateMethod;

public class Peperoni extends Pizza{

    @Override
    void addIngredients() {
        System.out.println("Добавляємо сир");
        System.out.println("Добавляємо пепероні");
    }
}
