package com.freeland.util.simplesort;

import java.util.Arrays;

/**
 * Created by chenhao on 2016/10/12.
 */
public class InsertSort {

    public static void insert(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int j = i-1;
            int t = a[i];
            while (j >= 0 && a[j] > t) {
                a[j+1] = a[j];
                j--;
            }
            a[j + 1] = t;
        }
    }

    public static void main(String[] args) {
        int[] a = {2, 1, 5, 4,7,3,9};
        System.out.println("pre sort");
        Arrays.stream(a).forEach(System.out::println);
        insert(a);
        System.out.println("after sort");
        Arrays.stream(a).forEach(System.out::println);
    }
}
