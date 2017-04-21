package com.github.guolll.design.abstractFactory;

/**
 * 芝加哥原料工厂
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ChicagoDough();
    }

    public Cheese createCheese() {
        return new ChicagoCheese();
    }

    public Sauce createSauce() {
        return new ChicagoSauce();
    }

    public Veggies[] createVeggies() {
        return new Veggies[]{new MushroomVeggie(), new OnionVeggie()};
    }
}
