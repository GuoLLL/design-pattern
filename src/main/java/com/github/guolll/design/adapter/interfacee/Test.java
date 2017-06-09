package com.github.guolll.design.adapter.interfacee;

/**
 * Created by Mr.L on 2017/6/9 0009.
 */
public class Test {
    public static void main(String[] args) {
        Source source = new Source();
        Wrapper wrapper = new Wrapper(source);
        wrapper.method1();
        wrapper.method2();
    }
}
