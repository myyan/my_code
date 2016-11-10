package com.freeland.util.code;

import java.util.Scanner;

/**
 * Created by chenhao on 2016/10/11.
 */
public class FindInteger {

    public boolean Find(int[][] array, int target) {
        int x = array[0].length;
        int y = array.length;
        for (int i = 0, j = y - 1; j >= 0 && i < x; ) {
            if (array[i][j] > target) {
                j--;
            } else if (array[i][j] < target) {
                i++;
            } else {
                return true;
            }
        }
        return false;
    }

}
