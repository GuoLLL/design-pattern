package com.github.guolll.design.factorymethod;

/**
 * Created by Mr.L on 2017/4/5 0005.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("---------Joel 需要的芝加哥的深盘披萨---------");
        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();//简历芝加哥披萨店
        Pizza joelPizza = chicagoPizzaStore.orderPizza("cheese");//下订单
        System.out.println("Joel ordered a " + joelPizza.getName() + "\n");

        System.out.println("---------Ethan 需要的纽约风味的披萨---------");
        NewYorkPizzaStore newYorkPizzaStore = new NewYorkPizzaStore();
        Pizza ethanPizza = newYorkPizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + ethanPizza.getName() + "\n");
    }
}
