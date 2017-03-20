package com.github.guolll.design.decorator;

/**
 * 摩卡
 */
public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;

    }

    public double cost() {
        return beverage.cost() + 0.5;
    }

    public String getDescription() {
        return beverage.getDescription() + ",Mocha";
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }
}
