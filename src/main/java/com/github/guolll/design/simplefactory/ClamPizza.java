package com.github.guolll.design.simplefactory;

/**
 * Created by Mr.L on 2017/4/5 0005.
 */
public class ClamPizza extends Pizza {
    public void prepare() {
        System.out.println("prepare ClamPizza");
    }

    public void bake() {
        System.out.println("bake ClamPizza");
    }

    public void cut() {
        System.out.println("cut ClamPizza");
    }

    public void box() {
        System.out.println("box ClamPizza");
    }
}
