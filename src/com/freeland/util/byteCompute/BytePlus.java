package com.freeland.util.byteCompute;

/**
 * Created by chenhao on 2016/12/21.
 */
public class BytePlus {

    public static void main(String[] args) {
        int length = 20;
        byte c = getVariableStructure(length);
        System.out.println(c);

    }


    private static byte getVariableStructure(Integer length) {

        return (byte) (length.byteValue() + 128);
    }
}
