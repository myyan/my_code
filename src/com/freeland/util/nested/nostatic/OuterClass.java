package com.freeland.util.nested.nostatic;

/**
 * Created by chenhao on 2016/12/22.
 */
public class OuterClass {



    public static void main(String[] args) {
        new AnonymousInner() {
            @Override
            public void method() {
                System.out.println("this is the anonymous inner class");
            }
        }.method();
        Anonymous anonymous = new Anonymous() {
            @Override
            public void doSome() {
                System.out.println("do some ");
            }
        };
        anonymous.doSome();
    }
}
