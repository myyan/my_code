package asd.util.performance;

import java.util.*;

/**
 * Created by chenhao on 2016/10/9.
 */
public class MapSort {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("chen", 2);
        map.put("hao", 1);
        map.put("yan", 6);
        map.put("zi", 4);
        Set<Map.Entry<String, Integer>> s = map.entrySet();
        LinkedList<Map.Entry<String, Integer>> list = new LinkedList<>(s);
        s.stream().sorted((Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) -> {
            return e2.getValue().compareTo(e2.getValue());
        }).forEach(x -> {
            System.out.println(x.getValue());
        });
        list.sort((l1, l2)->l1.getValue().compareTo(l2.getValue()));
        list.stream().forEach(System.out::println);
        Map<String,Integer> map1 = new LinkedHashMap<>();
        list.stream().forEach(x->{
            map1.put(x.getKey(),x.getValue());
        });
        map1.entrySet().stream().forEach(System.out::println);
        int a =1;
        Integer b =1;
        boolean c =b.equals(a);
        System.out.println(c);
        test(a);
        test(b);
    }

    public static void test(int a){
        System.out.println("int");
    }

//    public static void test(Integer a){
//        System.out.println("Integer");
//    }
}
