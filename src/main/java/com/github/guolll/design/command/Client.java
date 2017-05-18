package com.github.guolll.design.command;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Television television = new Television();//电视机，命令接收者
        TeleController controller = new TeleController(television);//遥控器，命令调用者
        controller.open();
        controller.change();
        controller.close();
    }
}
