package com.github.guolll.design.singleton;

/**
 * 双重检查加锁单例
 */
public class Singleton4 {


    /**
     * 利用静态变量来记录Singleton的唯一实例
     * volatile 关键字确保：当uniqueInstance变量被初始化成Singleton实例时，
     * 多个线程正确地处理uniqueInstance变量
     */
    private volatile Singleton4 uniqueInstance;

    /**
     * 私有化构造器
     */
    private Singleton4() {

    }

    public Singleton4 getUniqueInstance() {
        if (null == uniqueInstance) {
            synchronized (uniqueInstance) {
                if (null == uniqueInstance) {
                    uniqueInstance = new Singleton4();
                }
            }
        }
        return uniqueInstance;
    }
}
