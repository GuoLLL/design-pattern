package com.github.guolll.design.abstractFactory;

/**
 * 纽约披萨店
 */
public class NewYorkPizzaStore extends PizzaStore {

    Pizza createPizza(String type) {
        NewYorkPizzaIngredientFactory ingredientFactory = new NewYorkPizzaIngredientFactory();
        if ("cheese".equals(type)) {
            return new CheesePizza(ingredientFactory);
        } else {
            return new VeggiePizza(ingredientFactory);
        }
    }
}
