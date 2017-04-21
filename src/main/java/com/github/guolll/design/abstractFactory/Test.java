package com.github.guolll.design.abstractFactory;

/**
 * Created by Mr.L on 2017/4/21 0021.
 */
public class Test {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new NewYorkPizzaStore();
        pizzaStore.orderPizza("cheese");
    }
}
