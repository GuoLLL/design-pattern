package com.github.guolll.design.observer;

/**
 * 观察者
 */
public interface Observer {

    /**
     * 观察目标发生改变，观察者进行相应操作
     */
    void update(Subject subject);
}
