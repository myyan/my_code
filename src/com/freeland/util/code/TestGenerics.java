package com.freeland.util.code;

/**
 * Created by chenhao on 2016/10/11.
 */
public class TestGenerics {
    private static  <R,T> R request(T t){
        Object result = 1;
        return (R) result;
    }

    public static void main(String[] args) {
        int a = request(1);
    }

}
