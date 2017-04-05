package com.github.guolll.design.factorymethod;

/**
 * Created by Mr.L on 2017/4/5 0005.
 */
public class NewYorkStyleCheesePizza extends Pizza {
    public NewYorkStyleCheesePizza() {
        name = "Ny Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Crated Reggiano Cheese");
    }
}
