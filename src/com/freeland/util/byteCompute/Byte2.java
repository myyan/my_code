package com.freeland.util.byteCompute;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * Created by chenhao on 2016/11/14.
 */
public class Byte2 {
    private short sendSeq;
    private short respSeq;

    public int getSendNumber() {
        return (sendSeq & 0xFFFE) >> 1;
    }

    public int getRespNumber() {
        return (respSeq & 0XFFFE) >> 1;
    }

    public short getSendSeq() {
        return sendSeq;
    }

    public short getRespSeq() {
        return respSeq;
    }

    public static void main(String[] args) {

        ByteBuffer buffer = ByteBuffer.allocate(4);
        buffer.putShort((short) 2);
        buffer.putShort((short) 4);
        buffer.order(ByteOrder.BIG_ENDIAN);
        buffer.flip();
        System.out.println(buffer.getShort());
        System.out.println(buffer.getShort());
        buffer.flip();
        System.out.println();
        Byte2 b = new Byte2();
        b.sendSeq = 2;
        b.respSeq = 4;
        System.out.println(b.getSendNumber());
        System.out.println(b.getRespNumber());
    }
}
