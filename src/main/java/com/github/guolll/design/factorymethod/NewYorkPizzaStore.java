package com.github.guolll.design.factorymethod;

/**
 * Created by Mr.L on 2017/4/5 0005.
 */
public class NewYorkPizzaStore extends PizzaStore {
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NewYorkStyleCheesePizza();
        } else {
            return null;
        }
    }
}
