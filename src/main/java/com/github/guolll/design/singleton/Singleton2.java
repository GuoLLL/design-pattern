package com.github.guolll.design.singleton;

/**
 * 同步的单例
 */
public class Singleton2 {

    private Singleton2 instance;

    /**
     * 私有化构造器
     */
    private Singleton2() {

    }

    /**
     * 加同步关键字修饰方法，保证线程安全
     *
     * @return
     */
    public synchronized Singleton2 getInstance() {
        if (null == instance) {
            instance = new Singleton2();
        }
        return instance;
    }
}
