package asd.util.simplesort;

import asd.util.Group;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by chenhao on 2016/10/13.
 */
public class GroupBy {
    public static void main(String[] args) {
        Group group1 = new Group();
        Group group2 = new Group();
        Group group3 = new Group();
        group1.setAge(11);
        group1.setName("小李");
        group2.setName("小万福");
        group2.setAge(11);
        group3.setAge(12);
        group3.setName("小刘");
        Map<Integer,List<Group>> map = Arrays.asList(group1,group2,group3).stream()
                .collect(Collectors.groupingBy(Group::getAge));
        map.entrySet().stream().forEach(x->{
            System.out.println(x.getKey());
            System.out.println(x.getValue());
        });

        List<Group> list1 = Arrays.asList(group1,group2,group3);
        list1.stream().forEach(System.out::println);
        Group[] groups = list1.stream().map(x->x).toArray(Group[]::new);
        Arrays.stream(groups).forEach(System.out::println);
        Integer[] integers = list1.stream().map(x->1).toArray(Integer[]::new);
        Arrays.asList(integers).forEach(System.out::println);
        Map<Integer,Long> m = list1.stream().collect(Collectors.groupingBy(Group::getAge,Collectors.counting()));

    }
}
