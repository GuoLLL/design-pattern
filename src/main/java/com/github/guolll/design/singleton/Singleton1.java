package com.github.guolll.design.singleton;

/**
 * 简单单列模式
 */
public class Singleton1 {

    /**
     * 利用静态变量来保存Singleton1的实例
     */
    private Singleton1 uniqueInstance;

    /**
     * 私有化构造器，只有Singleton1类才能调用构造器
     */
    private Singleton1() {

    }

    /**
     * 创建实例
     *
     * @return
     */
    public Singleton1 getInstance() {
        if (null == uniqueInstance) {
            uniqueInstance = new Singleton1();
        }
        return uniqueInstance;
    }
}
