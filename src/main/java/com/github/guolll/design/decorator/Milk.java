package com.github.guolll.design.decorator;

/**
 * 牛奶
 */
public class Milk extends CondimentDecorator {

    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;

    }

    public double cost() {
        return this.beverage.cost() + 0.3;
    }

    public String getDescription() {
        return this.beverage.getDescription() + ",Milk";
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }
}
