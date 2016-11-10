package com.freeland.util.effective;

import java.util.Date;

/**
 * Created by chenhao on 2016/11/11.
 */
public class SubClass extends SuperClass {
    private Date data;

    public SubClass() {
        data = new Date();
    }

    public void print(){
        System.out.println("subclass print data"+ data);
    }

    public static void main(String[] args) {
        SubClass sc = new SubClass();
    }
}
