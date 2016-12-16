package com.freeland.util.callback;

/**
 * Created by chenhao on 2016/12/16.
 */
public class Memo {

    /**
     * this is asynchronous call back
     * when wang ask li some question
     * the wang don't have to block
     * he can do some other things
     *
     *
     * because use ask question use a thread so it is asynchronous
     * but if we call it directly . no start a new thread  it is synchronized invoke
     * so it's up to you
     * your design pattern
     *
     * when the li get the question
     * he will do some operate
     * then tell the wang
     * but how to tell the wang
     * use the call back
     * this is the reference hold the wang
     * so he will call it
     * and the wang will received
     *
     * we call compare it to the distributed system
     * like the amqp architecture
     * structure
     * so the most difference from the couple
     * decouple
     * yeah decouple is the important thing
     * do not do it directly
     * so the maintainable is the next thing
     * callback
     * callback
     * in the same system
     *
     * this is my understand
     * to diving into the callback
     * but it's not over
     * i will come back some day hahaha
     * */
}
