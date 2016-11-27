package com.freeland.util.nestedclass;

/**
 * Created by chenhao on 2016/11/24.
 */
public class Test {
    private static int a = 1;
    private int b = 2;

    static class Inner{
        private int c = 1;
        private int d = 2;

        public void print(){
            System.out.println(a);
            //非静态成员不能从静态区域引用
//            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
        }
    }

    public static void main(String[] args) {
        //外部类访问 静态内部类 可以通过内部类直接访问
        Test.Inner inner = new Inner();
        inner.print();
    }
}
