package designpattern.decorator;

/**
 * Created by chenhao on 2016/11/27.
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }


}
