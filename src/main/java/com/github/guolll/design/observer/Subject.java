package com.github.guolll.design.observer;

/**
 * 观察目标
 */
public interface Subject {

    /**
     * 注册观察者
     *
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 删除观察者
     *
     * @param observer
     */
    void removerObserver(Observer observer);

    /**
     * 当观察目标发生改变时，此方法需要被调用，以通知所有观察者
     */
    void notifyObserver();
}
