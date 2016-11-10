package com.freeland.util.byteCompute;

/**
 * Created by chenhao on 2016/11/7.
 */
public class Byte1 {
    byte sendSeq1;
    byte sendSeq2;
    byte respSeq1;
    byte respSeq2;


    public byte getSendSeq1() {
        return sendSeq1;
    }

    public void setSendSeq1(byte sendSeq1) {
        this.sendSeq1 = sendSeq1;
    }

    public byte getSendSeq2() {
        return sendSeq2;
    }

    public void setSendSeq2(byte sendSeq2) {
        this.sendSeq2 = sendSeq2;
    }

    public byte getRespSeq1() {
        return respSeq1;
    }

    public void setRespSeq1(byte respSeq1) {
        this.respSeq1 = respSeq1;
    }

    public byte getRespSeq2() {
        return respSeq2;
    }

    public void setRespSeq2(byte respSeq2) {
        this.respSeq2 = respSeq2;
    }


    public int getSendSeqNumber() {
        int seqNum = 0;
        for (int i = 1; i < 8; i++) {
            seqNum += (sendSeq1 >> i & 0x01) * (1 << (i - 1));
        }
        for (int j = 0; j < 8; j++) {
            seqNum += (sendSeq2 >> j & 0x01) * (1 << (j + 7));
        }
        return seqNum;
    }

    public int getCtrlCode() {
        return sendSeq1 & 0x01;
    }

    public int getRespSeqNumber() {
        int seqNum = 0;
        for (int i = 1; i < 8; i++) {
            seqNum += (respSeq1 >> i & 0x01) * (1 << (i-1));
        }
        for (int j = 0; j < 8; j++) {
            seqNum += (respSeq2 >> j & 0x01) * (1 << (j + 7));
        }
        return seqNum;
    }

    public static void main(String[] args) {
        Byte1 b = new Byte1();
        b.setSendSeq1((byte) 0x32);
        b.setSendSeq2((byte) 0x11);
        b.setRespSeq1((byte) 0x32);
        b.setRespSeq2((byte) 0x11);
        System.out.println(b.getCtrlCode());
        System.out.println(b.getSendSeqNumber());
        System.out.println(b.getRespSeqNumber());
        System.out.println(0x1132);
    }
}
