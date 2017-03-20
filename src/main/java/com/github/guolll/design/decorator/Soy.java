package com.github.guolll.design.decorator;

/**
 * Soy
 */
public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;

    }

    public double cost() {
        return beverage.cost() + 0.2;
    }

    public String getDescription() {
        return beverage.getDescription() + ",Soy";
    }
}
