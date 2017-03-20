package com.github.guolll.design.decorator;

/**
 * 饮料类
 */
public abstract class Beverage {

    /**
     * 描述
     */
    protected String description = "Unknown Beverage";


    /**
     * 价格
     *
     * @return
     */
    public abstract double cost();


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
