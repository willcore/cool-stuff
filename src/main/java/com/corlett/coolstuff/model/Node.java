package com.corlett.coolstuff.model;

public class Node {


    public Node(){}

    public Node(String content) {
        this.content = content;
    }

    public Node(String content, Node next) {
        this.content = content;
        this.next = next;
    }

    private String content;
    private Node next;

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
