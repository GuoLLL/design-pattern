package com.github.guolll.design.abstractFactory;

/**
 * 披萨工厂
 */
public interface PizzaIngredientFactory {

    Dough createDough();

    Cheese createCheese();

    Sauce createSauce();

    Veggies[] createVeggies();
}
