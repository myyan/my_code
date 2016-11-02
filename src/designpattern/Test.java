package designpattern;

/**
 * Created by chenhao on 2016/11/1.
 */
public class Test {
    public static void main(String[] args) {
        int number = 1;
        print(number);

        int a = -1;
        print(a);


        for (int i = 0; i < 32; i++) {
            a <<= 1;
            System.out.println("第 " + i + "次print");
            print(a);
        }


        for (int i = 0; i < 32; i++) {
            number <<= 1;
            print(number);
        }

        int c = -1;
        print(c);
        for (int i=0;i<32;i++){
            c>>>=1;
            print(c);
        }


    }

    public static void print(int num) {
        System.out.println(Integer.toBinaryString(num) + ":" + num);
    }
}
