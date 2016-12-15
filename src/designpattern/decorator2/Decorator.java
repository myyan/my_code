package designpattern.decorator2;

/**
 * Created by chenhao on 2016/12/7.
 */
public class Decorator implements Base {

    private String description;

    private int cost=2;

    private Base base;

    public Decorator(Base base) {
        this.base = base;
        description = "2块钱一杯";
    }

    public Decorator() {
        description = "2块钱一杯";
    }

    @Override
    public int cost() {
        return cost+base.cost();
    }

    @Override
    public String getDescription() {
        return base.getDescription()+","+description;
    }

    public void fly(){
        System.out.println("fly");
    }

    public static void main(String[] args) {
        Sub sub = new Sub();
        Decorator decorator = new Decorator(sub);
        System.out.println(decorator.getDescription());
        System.out.println(decorator.cost());
        decorator.fly();
    }
}
