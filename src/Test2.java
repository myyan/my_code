/**
 * Created by chenhao on 2016/9/22.
 */
public class Test2 {


    public static void test(int a) {
        System.out.println("test int");
    }

    public static void test(Integer a) {
        System.out.println("test Integer");
    }

    public static void main(String[] args) {
        Integer a = 1;
        Test2.test(a);

    }
}
