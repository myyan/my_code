package com.freeland.util.code;

/**
 * Created by chenhao on 2016/10/11.
 */
public class TreeNode<T> {
    TreeNode<T> left;
    TreeNode<T> right;
    T val;

    public TreeNode(TreeNode<T> left, TreeNode<T> right, T val) {
        this.left = left;
        this.right = right;
        this.val = val;
    }

    public TreeNode(T val) {
        this.val = val;
    }

    public TreeNode() {
    }
}
