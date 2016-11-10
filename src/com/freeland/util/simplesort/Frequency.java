package com.freeland.util.simplesort;

/**
 * Created by chenhao on 2016/11/3.
 */
public enum Frequency {
    High(1), Low(2);

    private int value;

    public int getValue() {
        return value;
    }

    Frequency(int value) {
        this.value = value;
    }

    public static Frequency valueOf(Integer value) {
        switch (value) {
            case 0:
                return Low;
            case 1:
                return High;
            default:
                return null;
        }
    }

    public static void main(String[] args) {

    }
}
