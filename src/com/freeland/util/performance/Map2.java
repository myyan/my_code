package com.freeland.util.performance;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

/**
 * Created by chenhao on 2016/10/8.
 */
public class Map2{
    public static void main(String[] args) {
        List a = Arrays.asList(1,2,3,4).stream().filter(dd->dd.equals(1)).collect(Collectors.toList());
        List<Integer> demo1 = Arrays.asList(1,2,3,4,5);
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"test1");
        map.put(2,"test2");
        a.stream().forEach(System.out::println);
        demo1.stream().map(
                x->{
                    x=x+1;
                   return map.get(1);
                }
        ).collect(Collectors.toList()).forEach(System.out::println);
        demo1.stream().forEach(System.out::println);
        List<String> l = map.entrySet().stream().map(x->{
            if (x.getKey()==1){
                x.setValue("set1");
            }
            return x.getValue();
        }).collect(Collectors.toList());
        l.stream().forEach(System.out::println);

    }
}
