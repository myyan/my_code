import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by chenhao on 2016/9/22.
 */
public class StreamTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 1, 3, 7, 6, 11, 19, 32);
//        list.stream().forEach(n -> System.out.println(n));
//        list.forEach( n -> System.out.println(n));
//        list.stream().map( x -> x*x).forEach(System.out::println);
//        list.forEach(System.out::println);
//        int sum = list.stream().filter(x -> x > 5).sorted(Comparator.comparing()).map(x -> x * x).reduce((x, y) -> x + y).get();
//        System.out.println(sum);
        User user1 = new User("chenhao",18);
        User user2 = new User("chenhao",19);
        List<User> users = Arrays.asList(user1,user2);
//         users.stream().filter( x -> x.getUsername().equals("chenhao")).mapToInt( x -> x.getAge()).collect(Collectors.toList());
        List<Integer> list2 = list.stream().filter(x -> x>5).sorted().collect(Collectors.toList());
        System.out.println(list2);
        List<String> list3 = Arrays.asList("a1","a2","a3").stream().map(String::toUpperCase).sorted().collect(Collectors.toList());
        System.out.println(list3);
        Stream<List<String>> stream = Stream.of(Arrays.asList("a1"),Arrays.asList("a2","a3"));
        Stream<String> o = stream.flatMap(x -> x.stream());
        o.forEach(System.out::println);
    }
}


class User {
    private String username;

    private int age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }
}
