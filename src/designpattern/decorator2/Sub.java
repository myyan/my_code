package designpattern.decorator2;

/**
 * Created by chenhao on 2016/12/7.
 */
public class Sub implements Base{

    private String description;
    private int cost = 1;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Sub(int cost) {
        this.cost = cost;
    }

    public Sub() {
        description = "1.0元一杯";
    }

    @Override
    public int cost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return description;
    }

}
