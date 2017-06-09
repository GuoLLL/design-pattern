package com.github.guolll.design.adapter.interfacee;

/**
 * Created by Mr.L on 2017/6/9 0009.
 */
public class Wrapper implements Targetable {

    private Source source;

    public Wrapper(Source source) {
        this.source = source;
    }

    public void method1() {
        source.method1();
    }

    public void method2() {
        System.out.println("========>method2");
    }
}
