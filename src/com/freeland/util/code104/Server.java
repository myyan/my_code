package com.freeland.util.code104;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by chenhao on 2016/11/3.
 */
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(9999);
            System.out.println("服务端开启监听，端口9999");
            while (true){
                Socket socket = serverSocket.accept();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
