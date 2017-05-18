package com.github.guolll.design.singleton;

/**
 * 双重检查加锁单例
 */
public class Singleton4 {


    /**
     * 利用静态变量来记录Singleton的唯一实例
     * volatile关键字的一个作用是禁止指令重排，把instance声明为volatile之后，
     * 对它的写操作就会有一个内存屏障（什么是内存屏障？），这样，在它的赋值完成之前，就不用会调用读操作.
     * volatile 关键字确保：当uniqueInstance变量被初始化成Singleton实例时，
     * 多个线程正确地处理uniqueInstance变量.
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
                /**
                 * 注意：volatile阻止的不singleton = new Singleton()这句话内部[1-2-3]的指令重排，
                 * 而是保证了在一个写操作（[1-2-3]）完成之前，不会调用读操作（if (instance == null)）。
                 */
                if (null == uniqueInstance) {
                    uniqueInstance = new Singleton4();
                }
            }
        }
        return uniqueInstance;
    }
}
