package com.freeland.util.code104;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * Created by chenhao on 2016/11/3.
 */
public class ConvertUtil {
    public static byte[] int2ByteArray1(int i) {
        byte[] result = new byte[4];
        result[0] = (byte) ((i >> 24) & 0xFF);
        result[1] = (byte) ((i >> 16) & 0XFF);
        result[2] = (byte) ((i >> 8) & 0xFF);
        result[3] = (byte) (i & 0xFF);
        return result;

    }

    public static byte[] int2ByteArray2(int i) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        DataOutputStream out = new DataOutputStream(bos);
        out.write(i);
        byte[] b = bos.toByteArray();
        out.close();
        bos.close();
        return b;
    }

    public static int byteArray2Int(byte[] b) {
        int value = 0;
        for (int i = 0; i < b.length; i++) {
            value += (b[i] & 0xFF) << (8 * (3 - i));
        }
        return value;
    }
}
