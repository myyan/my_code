package asd.util.performance;

import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by chenhao on 2016/10/9.
 */
public class Java8 {
    public static void main(String[] args) {
        User user1 = new User("asd","123",1);
        User user2 = new User("ba","123",2);
        User user3 = new User("aaa","34",3);
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        for (int i=0;i<100000;i++){
            String name = "user"+i;
            User user = new User(name,name,1);
            users.add(user);
        }
        long time1 = System.currentTimeMillis();
        users.stream().sorted((a,b)->a.getUsername().compareTo(b.getUsername())).forEach(System.out::println);
        long time2 = System.currentTimeMillis();
        System.out.println((time2-time1));
        long count = users.stream().filter(x->{
            return x.getUsername().startsWith("user");
        }).count();
        System.out.println(count);

        List<Integer> ls = Arrays.asList(1,2,3,4,5,1,2,1,5,3,2,1);
        Map<Integer,List<Integer>> map = ls.stream().map(x->x+1).collect(Collectors.groupingBy(Function.identity(),Collectors.toList()));
        System.out.println(map);
        String lll = ls.stream().map(x->x.toString()).collect(Collectors.joining(" :"));
        System.out.println(lll);
        IntSummaryStatistics stats = ls.stream().mapToInt(x->x).summaryStatistics();
        System.out.println(stats);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println(localDate);
        int m = localDateTime.getMonthValue();
        int d = localDate.getDayOfMonth();
        int m1 = localDate.getMonthValue();
        int xxx = localDate.getDayOfMonth();
        LocalTime localTime = LocalTime.now();
        localTime.getHour();
        localTime.getMinute();
        String path = Paths.get("demo","ok","1").toString();
        System.out.println(path);

    }
}
