package com.github.guolll.design.singleton;

/**
 * 静态单列模式
 */
public class Singleton3 {

    /**
     * 创建静态化变量，只有应用启动是才会分配内存空间.
     * 以此达到线程安全
     */
    private static Singleton3 instance = new Singleton3();

    /**
     * 私有化构造器，这是必须的。
     */
    private Singleton3() {

    }

    public Singleton3 getInstance() {
        return instance;
    }
}
