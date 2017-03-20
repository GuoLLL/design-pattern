package com.github.guolll.design.decorator;

/**
 * 咖啡产房
 */
public class StarBucksCoffee {
    public static void main(String[] args) {

        Beverage beverage = new Espresso();//浓咖啡
        System.out.println(beverage.description + ",$" + beverage.cost());

        Beverage beverage1 = new DarkRoast();//烘焙咖啡
        beverage1 = new Milk(beverage1);//加牛奶
        beverage1 = new Mocha(beverage1);//加摩卡
        beverage1 = new Soy(beverage1);//加Soy
        System.out.println(beverage1.getDescription() + ",$" + beverage1.cost());//咖啡名称，价格
    }
}
