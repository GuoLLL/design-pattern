package com.github.guolll.design.simplefactory;

/**
 * Created by Mr.L on 2017/4/5 0005.
 */
public class VeggiePizza extends Pizza {
    public void prepare() {
        System.out.println("prepare VeggiePizza");
    }

    public void bake() {
        System.out.println("bake VeggiePizza");
    }

    public void cut() {
        System.out.println("cut VeggiePizza");
    }

    public void box() {
        System.out.println("box VeggiePizza");
    }
}
