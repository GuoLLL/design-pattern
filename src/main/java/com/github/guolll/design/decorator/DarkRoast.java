package com.github.guolll.design.decorator;

/**
 * 烘焙咖啡
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        super.description = "DarkRoast";
    }

    public double cost() {
        return 1.05;
    }
}
