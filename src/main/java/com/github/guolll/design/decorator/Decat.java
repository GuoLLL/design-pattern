package com.github.guolll.design.decorator;

/**
 * 迪加特咖啡
 */
public class Decat extends Beverage {

    public Decat() {
        super.description = "Decat";
    }

    public double cost() {
        return 2;
    }
}
