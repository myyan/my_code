package com.freeland.util.callback;

/**
 * Created by chenhao on 2016/12/16.
 */
public class Wang implements CallBack {

    Li li;

    public Wang(Li li) {
        this.li = li;
    }

    public void askQuestion(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    li.executeMessage(Wang.this,"what day is it today ?");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    @Override
    public void solve(String result) {
        System.out.println("result is :" + result);
    }
}
