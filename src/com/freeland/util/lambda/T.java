package com.freeland.util.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenhao on 2016/12/8.
 */
public class T {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.stream().forEach(x->{
            System.out.println(x);
        });
    }
}
