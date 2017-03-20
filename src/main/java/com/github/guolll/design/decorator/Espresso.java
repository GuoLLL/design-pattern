package com.github.guolll.design.decorator;

/**
 * 浓咖啡
 */
public class Espresso extends Beverage {

    public Espresso() {
        super.description = "Espresso";
    }

    public double cost() {
        return 2;
    }
}
