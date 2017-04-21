package com.github.guolll.design.abstractFactory;

/**
 * 奶酪披萨
 */
public class CheesePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    /**
     * 要制作披萨必须有披萨原料，而这些原料是有原料工厂提供的
     *
     * @param ingredientFactory 原料工厂
     */
    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        super.setName("CheesePizza");
        this.ingredientFactory = ingredientFactory;
    }


    /**
     * 实现 prepare 方法
     * prepare 方法一步一步制作披萨，每当需要原料时，就跟工厂要
     */
    void prepare() {
        System.out.println("Prepareing..." + super.getName());
        super.dough = this.ingredientFactory.createDough();
        super.cheese = this.ingredientFactory.createCheese();
    }
}
