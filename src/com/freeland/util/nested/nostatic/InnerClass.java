package com.freeland.util.nested.nostatic;

/**
 * Created by chenhao on 2016/12/22.
 *
 * This is inner class
 *
 * 内部类需要依赖外部类的存在
 * 因此 需要先有外部类
 *
 * 内部类可以直接访问外部类的任何私有属性 包括静态的
 */
public class InnerClass {

    private int a;

    private static int b;

    class Inner {

        public void doSome() {
            System.out.println(" inner do ");
        }

        public int getValue() {
            a = 1;
            b = 2;
            return a;
        }
    }

    public void getValue() {
        System.out.println(a);
        System.out.println(b);
    }

    public void innerDo() {
        Inner inner = new Inner();
        inner.doSome();
    }

    public static void main(String[] args) {
        InnerClass outer = new InnerClass();
        outer.innerDo();
        InnerClass outer1 = new InnerClass();
        Inner inner = outer.new Inner();
        System.out.println(inner.getValue());
        outer.getValue();
    }

}
