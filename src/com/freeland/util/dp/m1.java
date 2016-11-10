package com.freeland.util.dp;

import java.util.Arrays;

/**
 * Created by chenhao on 2016/10/24.
 */
public class m1 {
    public static void main(String[] args) {
        int a[] = {2, 1, 4, 5, 3};
        m1(a);
    }

    public static void m1(int[] a) {
        int f[] = new int[a.length];
        f[0] = 1;
        for (int i = 1; i < a.length; i++) {
            f[i] = 1;
            for (int j = 0; j < i; j++) {
                if (a[i] > a[j] && f[j] + 1 > f[i]) {
                    f[i] = f[j] + 1;
                }
            }
        }
        System.out.println(Arrays.stream(f).max().getAsInt());
    }
}
