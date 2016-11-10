package com.freeland.util.code;

import java.util.Arrays;
import java.util.List;

/**
 * Created by chenhao on 2016/10/11.
 */
public class ReverseList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        ListNode<Integer> node = new ListNode<>();
        arrayToList(list,node);
        printList(node);
        printList(node);
        printList(reverseList(node));
    }

    public static void arrayToList(List<Integer> list, ListNode<Integer> node) {
        ListNode n = node;
        for (Integer i : list) {
            if (node.val==null||node.val.equals("")){
                node.val = i;
            }else{
                ListNode<Integer> tem = new ListNode<>(i);
                n.next = tem;
                n = tem;
            }
        }
    }
    public static void printList(ListNode node){
        ListNode tem  = node;
        while (tem!=null){
            System.out.println(tem.val);
            tem = tem.next;
        }
        System.out.println("_-----------");
    }

    public static ListNode reverseList(ListNode node){
        ListNode p = node;
        ListNode pre = null;
        ListNode next ;
        while (p!=null){
            next = p.next;
            p.next = pre;
            pre = p;
            p = next;
        }
        return pre;
    }
}
