package com.freeland.util.nested.nostatic;

/**
 * Created by chenhao on 2016/12/22.
 * <p>
 * The following program shows how to pass an anonymous inner class as a method argument
 */
public class AnonymousArgument {

    public void displayMessage(Messgae messgae) {
        System.out.println(messgae.greet());
    }

    public static void main(String[] args) {
        AnonymousArgument argument = new AnonymousArgument();
        argument.displayMessage(new Messgae() {
            @Override
            public String greet() {
                return "hello";
            }
        });
    }
}

interface Messgae {
    public abstract String greet();
}
