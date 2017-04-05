package com.github.guolll.design.simplefactory;

/**
 * Created by Mr.L on 2017/4/5 0005.
 */
public class PepperonPizza extends Pizza {
    public void prepare() {
        System.out.println("prepare PepperonPizza");
    }

    public void bake() {
        System.out.println("bake PepperonPizza");
    }

    public void cut() {
        System.out.println("cut PepperonPizza");
    }

    public void box() {
        System.out.println("box PepperonPizza");
    }
}
