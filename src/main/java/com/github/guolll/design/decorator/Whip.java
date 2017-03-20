package com.github.guolll.design.decorator;

/**
 * 鲜奶油
 */
public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;

    }

    public double cost() {
        return beverage.cost() + 0.1;
    }

    public String getDescription() {
        return beverage.getDescription() + ",Whip";
    }
}
