package com.github.guolll.design.abstractFactory;

/**
 * 纽约原料工厂
 */
public class NewYorkPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new NewYorkDough();
    }

    public Cheese createCheese() {
        return new NewYorkCheese();
    }

    public Sauce createSauce() {
        return new NewYorkSauce();
    }

    public Veggies[] createVeggies() {
        return new Veggies[]{new GarlicVeggie(), new OnionVeggie()};
    }
}
