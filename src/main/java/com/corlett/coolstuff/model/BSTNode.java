package com.corlett.coolstuff.model;

public class BSTNode {

    Integer number;
    BSTNode left;
    BSTNode right;

    public BSTNode(Integer number, BSTNode left, BSTNode right) {
        this.number = number;
        this.left = left;
        this.right = right;
    }

    public BSTNode(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public BSTNode getLeft() {
        return left;
    }

    public void setLeft(BSTNode left) {
        this.left = left;
    }

    public BSTNode getRight() {
        return right;
    }

    public void setRight(BSTNode right) {
        this.right = right;
    }
}
