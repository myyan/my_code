package com.freeland.util.code;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by chenhao on 2016/10/12.
 */
public class Xor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (sc.hasNext()){
            int a = sc.nextInt();
            if (a==100){
                break;
            }
            list.add(a);

        }
        list.stream().forEach(System.out::println);
        int y=list.get(0) ;
        for (int i =1;i<list.size();i++){
            y = y^list.get(i);
        }
        System.out.println(y);
    }
}
