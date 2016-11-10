package com.freeland.util.performance;

/**
 * Created by chenhao on 2016/9/29.
 */
public class TestSingleton2 {
    public static void main(String[] args) {
        Person person = Person.getPerson();
        System.out.println(person);
        System.out.println(person.hashCode());
    }
}
