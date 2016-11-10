package com.freeland.util.code104;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.Socket;

/**
 * Created by chenhao on 2016/11/3.
 */
public class ServerHandler implements Runnable{
    public static int count = 0;
    Socket socket;

    public ServerHandler(Socket socket) {
        count++;
        this.socket = socket;
        System.out.println("用户:"+count+"接入");
    }

    @Override
    public void run() {
        BufferedInputStream bis = null;
        try {
            bis = new BufferedInputStream(socket.getInputStream());
            while (true){
                byte[] head= new byte[4];

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
