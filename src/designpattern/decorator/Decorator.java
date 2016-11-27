package designpattern.decorator;

/**
 * Created by chenhao on 2016/11/27.
 */
public class Decorator extends Super {
    Super s;

    public Decorator(Super s) {
        this.s = s;
    }

    @Override
    public String getName() {
        return "Decorator " + s.getName();
    }

    public static void main(String[] args) {
        Super s = new Sub();
        Super s2 = new Decorator(s);
        System.out.println(s2.getName());
    }
}
