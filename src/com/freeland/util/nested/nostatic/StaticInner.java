package com.freeland.util.nested.nostatic;

/**
 * Created by chenhao on 2016/12/22.
 *
 * 静态内部类
 *
 * 其实不依赖外部对象的存在
 * 内部类不能调用外部类的 实例成员的私有属性
 * 但是可以直接使用外部类的 静态私有属性
 * 这是和内部类区别最大的地方
 */
public class StaticInner {

    private int a;
    private static int b;

    static class Inner {
        public void innerDo() {
            b = 2;
            System.out.println("inner do");
            System.out.println(b);
        }
    }

    public void outerDo() {

    }

    public static void main(String[] args) {
        StaticInner.Inner inner = new StaticInner.Inner();
        inner.innerDo();
    }
}
