package com.example.patternsexamples.templateMethod;

public abstract class Pizza {

    public void makePizza() {
        System.out.println("Розкатуємо тісто...");
        System.out.println("Намазуємо соус...");
        addIngredients();
        System.out.println("Запікаємо...");
        System.out.println("Подаемо на стіл!");
    }

    abstract void addIngredients();
}
