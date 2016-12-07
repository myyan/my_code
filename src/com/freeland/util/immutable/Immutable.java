package com.freeland.util.immutable;

/**
 * Created by chenhao on 2016/12/7.
 */
public class Immutable {

    private final User user;

    public Immutable(User user) {
        this.user = user;
    }

    public User getUser() throws CloneNotSupportedException {
        return (User) user.clone();
    }



    /**
     * 问题出在哪?
     * immutable 其实是可变的
     *
     * 然后每次返回的都是 clone 就不会出现问题
     * */
    public static void main(String[] args) throws CloneNotSupportedException {
        Immutable immutable = new Immutable(new User("chen"));
        User user = immutable.getUser();
        System.out.println(user);
        user.setName("hao");
        System.out.println(immutable.getUser());
    }
}
