package designpattern.decorator;

/**
 * Created by chenhao on 2016/11/27.
 */
public abstract class Beverage {
    String description = "Unknown beveage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
