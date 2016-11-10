package com.freeland.util.code;

/**
 * Created by chenhao on 2016/10/12.
 */
public class FindSecondMax {
    public static void main(String[] args) {
        int x = secondMax(new int[]{2, 1, 5, 7, 8, 10, 12});
        System.out.println(x);
    }

    public static int secondMax(int[] a) {
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        if (a.length < 2) {
            System.exit(-1);
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                second = max;
                max = a[i];
            } else {
                if (a[i] > second) {
                    second = a[i];
                }
            }
        }
        return second;
    }
}
