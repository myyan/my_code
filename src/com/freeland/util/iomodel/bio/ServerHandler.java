package com.freeland.util.iomodel.bio;

import java.io.*;
import java.net.Socket;
import java.util.Date;

/**
 * Created by chenhao on 2016/11/18.
 */
public class ServerHandler implements Runnable {
    Socket socket;

    public ServerHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        System.out.println("client connected from socket :"+socket);
        BufferedReader in = null;
        PrintWriter out = null;
        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream());
            String currentTime = null;
            String body = null;
            while (true) {
                body = in.readLine();
                if (body==null){
                    break;
                }
                System.out.println("the time server receive order : "+body);
                currentTime = new Date().toString();
                out.println(currentTime);
            }
        } catch (IOException e) {
            if (in !=null){
                try {
                    in.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
            if (out!=null){
                out.close();
            }
            if (socket!=null){
                try {
                    socket.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }
}
