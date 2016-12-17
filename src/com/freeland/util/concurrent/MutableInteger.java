package com.freeland.util.concurrent;

/**
 * Created by chenhao on 2016/12/17.
 */
/**
 * this class is not thread safe
 * because the state - > age
 * if used to multi-thread
 * some unpredictable result may be occur
 *
 * if thread A invoke set method modify the age value
 * and thread B get the age ,it is very common that the age value
 * not modified in A local memory
 * so the visibility is so important
 * in multi-thread
 *
 *
 * 但是我们仅仅是对set方法进行同步出现问题吗？
 * 会
 * 因为 set保证了内存的
 *
 * 其实谈谈我个人的理解 就是关于可见性
 *
 * 可见性就是 在使用到该变量的所有的地方 都可以随时的看到
 * 这种随时的看到 指的就是 当有一处发生变化的时候
 * 其他任何使用到该变量的地方都会得到这个变化的消息
 * 或者用户层并不去关心这个变化的消息
 * 但是底层是需要知道这个消息的 来维护数据的一致性
 * 但是 底层是怎么知道这个消息的呢？
 * cache 一致性
 * cache 失效
 * 主要的就是上面的这些原理
 *
 *
 * 那么原子性又是什么呢？
 * 原子性和可见性又有什么样的区别呢？
 *
 *
 * 天然的原子性和人工维护的原子性
 * 天然的原子性就是 在java虚拟机指令里面是原子性呢
 * 就是通过一条指令就是做到的
 * 如果达不到上面的要求 那么就不是天然的原子性
 * 那就需要我们人工的进行维护
 * 人工的维护 就需要 保证原子语义
 * 也就引来了 同步机制
 * 我们称之为 锁
 * lock
 *
 * 原子性描述的是一个东西要么做 要么不做
 * 做就是要做完 我做的时候别人干扰不了我
 * 如果我做的时候 别人想改这个数据 就会收到限制
 * 原子是最小的单位 不可分割的 就这样理解
 *
 * 想象一下一个情景:
 *  就是只有原子性没有可见性的这个情景
 *
 *  虽然你是原子操作 但是你对于某个的修改 却不能影响到其他线程使用的该变量
 *  所以就会导致问题
 *
 *  接下来想象一下只有可见性没有原子性的情况下:
 *  就是虽然我是可见的 但是我对于某个状态的修改 不是原子的
 *  在多线程的环境下 会出现问题 导致数据的不一致
 *
 *  但是原子性是怎么实现的呢？在java内存模型里面？
 *  一个就是同步代码块  因此 就是synchronized 这个语法糖
 *
 *
 *  synchronized 既可以保证变量的可见性有可以保证变量的原子性
 *
 *
 *  volatile  只能保证变量的可见性
 *
 *  就是感觉很奇怪 可能就是当初那些大佬们设计的原因吧
 *
 *
 *
 * */
public class MutableInteger {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }




}
