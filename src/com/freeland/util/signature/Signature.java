package com.freeland.util.signature;

import com.freeland.util.immutable.User;

import java.util.Random;

/**
 * Created by chenhao on 2016/12/7.
 */
public class Signature {
    private int i = 0;

    public User testSignature() {
        return new User("name" + i++);
    }

    public void test(User user) {
        System.out.println(user);
    }

    public static void main(String[] args) {
        Signature s = new Signature();
        for (int i = 0; i < 10; i++) {
            s.test(s.testSignature());
        }
    }


}
