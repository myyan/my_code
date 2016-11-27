package designpattern.decorator;

/**
 * Created by chenhao on 2016/11/27.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return .89;
    }
}
