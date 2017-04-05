package com.github.guolll.design.factory;

/**
 * Created by Mr.L on 2017/4/5 0005.
 */
public class Test {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        Pizza cheesePizza = pizzaStore.orderPizza("cheese");
        System.out.println();
        Pizza clamPizza = SimplePizzaFactory.createClamPizza();
        clamPizza.prepare();
        clamPizza.bake();
        clamPizza.cut();
        clamPizza.bake();
    }
}
