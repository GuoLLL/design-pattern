package com.github.guolll.design.command;

/**
 * 电视机类
 * 命令接收者：命令接收者可以直接执行命令，也可以委托第三方去执行命令，
 * 具体的执行过程不需要告知调用者，只需要返回命令结果给调用者即可
 */
public class Television {

    /**
     * 接收到命令要做的事，开机
     */
    public void open() {
        System.out.println("开启电视机");
    }

    /**
     * 接收到命令要做的事，关机
     */
    public void close() {
        System.out.println("关闭电视剧");
    }

    /**
     * 接收到命令要做的事，换频道
     */
    public void changeChannel() {
        System.out.println("选择频道");
    }
}
