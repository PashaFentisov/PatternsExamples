package com.example.patternsexamples.templateMethod;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pizza peperoni = new Peperoni();
        Pizza fourCheese = new FourCheese();
        List<Pizza> pizzas = List.of(peperoni, fourCheese);
        pizzas.forEach(pizza -> {
            pizza.makePizza();
            System.out.println("=================================");
        });
    }
}
