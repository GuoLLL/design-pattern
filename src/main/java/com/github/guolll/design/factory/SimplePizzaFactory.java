package com.github.guolll.design.factory;

/**
 *
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CheesePizza();
        } else if (type.equals("clam")) {
            return new CheesePizza();
        } else if (type.equals("veggie")) {
            return new VeggiePizza();
        } else {
            return new PepperonPizza();
        }
    }

    public static Pizza createCheesePizza(){
        return new CheesePizza();
    }

    public static Pizza createClamPizza(){
        return new ClamPizza();
    }

    public static Pizza createVeggiePizza(){
        return new VeggiePizza();
    }

    public static Pizza createPepperonPizza(){
        return new PepperonPizza();
    }
}
