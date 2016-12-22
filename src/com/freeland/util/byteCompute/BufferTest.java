package com.freeland.util.byteCompute;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * Created by chenhao on 2016/12/22.
 */
public class BufferTest {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(5);
        buffer.putInt(127);
        buffer.put((byte) 0x01);
        buffer.order(ByteOrder.LITTLE_ENDIAN);
        byte[] bytes = buffer.array();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }


        ByteBuffer byteBuffer = ByteBuffer.allocate(5);

        byteBuffer.putInt(127);
        byteBuffer.put((byte) 0x01);
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        bytes = byteBuffer.array();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }


    }
}
