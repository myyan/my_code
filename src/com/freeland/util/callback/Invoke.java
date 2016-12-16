package com.freeland.util.callback;

/**
 * Created by chenhao on 2016/12/16.
 */
public class Invoke {
    public static void main(String[] args) {
        Li li = new Li();
        Wang wang = new Wang(li);
        wang.askQuestion();
    }
}
