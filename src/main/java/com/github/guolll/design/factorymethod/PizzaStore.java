package com.github.guolll.design.factorymethod;

/**
 * Created by Mr.L on 2017/4/5 0005.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);

        pizza.perpare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /*
     * 创建pizza的方法交给子类去实现
     */
    abstract Pizza createPizza(String type);
}
