package com.github.guolll.design.abstractFactory;

/**
 * 披萨商店
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }


    /**
     * 创建披萨的方法交个子类实现
     *
     * @param type 披萨类型
     * @return 披萨
     */
    abstract Pizza createPizza(String type);
}
