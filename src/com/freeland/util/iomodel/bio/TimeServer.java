package com.freeland.util.iomodel.bio;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by chenhao on 2016/11/18.
 */
public class TimeServer {
    public static void main(String[] args) throws IOException {
        int port = 8081;
        ServerSocket serverSocket = null;
        serverSocket = new ServerSocket(port);
        System.out.println("the time server is start on port :"+port);
        Socket socket = null;
        while (true) {
            socket = serverSocket.accept();
            new Thread(new ServerHandler(socket)).start();
        }
    }
}
