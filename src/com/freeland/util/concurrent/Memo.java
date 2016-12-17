package com.freeland.util.concurrent;

/**
 * Created by chenhao on 2016/12/17.
 */
public class Memo {
    /**
     * memo
     *
     * because of the lock
     * even though we have multi-core
     * and the syn result in the blocking
     * which some thread wait for the lock free
     *
     *
     * due to the lock
     * the concurrent become slower and slower
     * multi-core don't bring us the high performance
     * instead result in the sequential handle request
     * we call this scene as poor concurrency
     *
     *
     * so at the first time when we design the system
     * we should choose the properly architecture to implement system
     *
     *
     *
     * dig into the problem
     *
     * shared object
     *
     * shared object states
     *
     * what is state ?
     *
     * the state is the hold of the mutable data
     *
     * shared state is a way of communication from different threads
     *
     * 线程的可见性
     *
     * 通常我们无法确保执行读操作的线程能够实时的看到其他线程对于该数据的写入
     * 有时候根本是不可能的事情 所以 这的确是一个问题
     * 为了保证多线程对于写入操作对内存是可见的
     * 必须使用同步机制
     *
     * NoVisibility 很容易在多线程的环境中出现错误
     *
     * 既然是不可见的  所以说  对于同一个状态的操作  将会变得不可见
     * 那么 依赖这种状态的一些function 就会出现很大的问题
     * 或者在多线程的环境下就是错的
     * */
}
