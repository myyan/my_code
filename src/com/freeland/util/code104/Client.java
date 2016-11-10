package com.freeland.util.code104;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by chenhao on 2016/11/3.
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            byte[] body = br.readLine().getBytes();
            byte[] head = ConvertUtil.int2ByteArray1(body.length);
            BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
            bos.write(head);
            bos.flush();
            bos.write(body);
            bos.flush();
        }
    }
}
