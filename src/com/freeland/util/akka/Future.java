package com.freeland.util.akka;

/**
 * Created by chenhao on 2016/12/17.
 */
public class Future {
    /**
     * 在我去了解之前 我先大致说一说我的看法吧
     *
     * future 从字面意思上来说 代表的是将来
     * 但是我们一般在coding的时候都是现在
     * 将来的代码 一般都是在线程里
     * 所以我觉得future 可能是异步的
     *
     * 但是又有一个问题了 异步的怎么去保存结果呢？
     * 通过回调？ 但是要等多久呢？
     * 万一我这边用的时候没有值 怎么办？ 报异常？
     *
     *
     * Actors are great for processing many messages,
     * capturing state and reacting with different behavior
     * based on the messages they receive
     *
     * they are resilient objects that can live on for a long time
     * even when problems occur, using monitoring and supervision
     *
     * Futures are the tool to use when you would rather use functions
     * and don't really need objects to do the job
     * A future is a placeholder for a function result that
     * will be available in the future
     *
     * It is effectively an asynchronous result
     * It gives us a way to reference the result
     * that will eventually become available
     * the below figure show s the concepts
     *
     *
     * */
}
