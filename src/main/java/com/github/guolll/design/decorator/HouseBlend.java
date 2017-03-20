package com.github.guolll.design.decorator;

/**
 * 混合咖啡
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        super.description = "HouseBlend";
    }

    public double cost() {
        return 0.89;
    }
}
