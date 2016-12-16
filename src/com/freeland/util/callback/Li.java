package com.freeland.util.callback;

/**
 * Created by chenhao on 2016/12/16.
 */
public class Li {

    public void executeMessage(CallBack callBack, String question) throws InterruptedException {
        System.out.println("get a question from somewhere:" + question);
        for (int i = 0; i < 10000; i++) {

        }
        Thread.sleep(2000);
        String result = "the answer is 2";
        callBack.solve(result);
    }
}
