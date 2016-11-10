package com.freeland.util.code;


import java.util.Scanner;

/**
 * Created by chenhao on 2016/10/12.
 */
public class CountOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CountOne countOne = new CountOne();
        while (scanner.hasNext()){
            System.out.println(countOne.countOne(scanner.nextInt()));
        }

    }

    public int countOne(int x){
        if (x<0){
            x = -x;
        }
        int count = 0;
        while (x!=0){
            if ((x&1)==1){
                count++;
            }
            x>>=1;
        }
        return count;
    }
}
