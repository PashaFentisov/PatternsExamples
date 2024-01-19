package com.example.patternsexamples.templateMethod;

public class FourCheese extends Pizza{

        @Override
        void addIngredients() {
            System.out.println("Добавляємо сир1");
            System.out.println("Добавляємо сир2");
            System.out.println("Добавляємо сир3");
            System.out.println("Добавляємо сир4");
        }
}
