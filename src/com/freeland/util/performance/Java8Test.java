package com.freeland.util.performance;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by chenhao on 2016/10/8.
 */
public class Java8Test {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("atream1", 1);
        map.put("stream2", 3);
        map.put("ctream3", 2);
        map.put("hoa",1);
        map.entrySet().stream().sorted((a, b) -> a.getKey().compareTo(b.getKey())).
                forEach(x -> {
                            System.out.println(x.getKey());
                            System.out.println(x.getValue());
                        }
                );
        System.out.println("-----------------------");
        map.entrySet().stream().sorted((a, b) -> a.getValue().compareTo(b.getValue())).
                forEach(x -> {
                            System.out.println(x.getKey());
                            System.out.println(x.getValue());
                        }
                );
        System.out.println("----------------------");
        Set<Map.Entry<String,Integer>> set = map.entrySet();
        Map<Integer,Long> m2 =set.stream().collect(Collectors.groupingBy(Map.Entry::getValue,Collectors.counting()));
        System.out.println(m2);
        List<User> users;
        User user1 = new User("a","123",12);
        User user2 = new User("b","123",12);
        User user3 = new User("c","345",14);
        User user4 = new User("a","234",13);
        users = Arrays.asList(user1,user2,user3,user4);
        Map<String,Long> m = users.stream().collect(Collectors.groupingBy(User::getUsername,Collectors.counting()));
        System.out.println(m);
//        users.stream().collect(Collectors.groupingBy())
    }
}
