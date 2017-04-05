package com.github.guolll.design.factorymethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mr.L on 2017/4/5 0005.
 */
public abstract class Pizza {
    protected String name;//名称
    protected String dough;//面团
    protected String sauce;//酱料
    protected List<String> toppings = new ArrayList<String>(0);

    public void perpare() {
        System.out.println("Preparing " + this.name);
        System.out.println("Tossing dough");
        System.out.println("Adding sauce");
        System.out.println("Adding toppings");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("   " + toppings.get(i));
        }
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
