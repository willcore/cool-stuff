package com.corlett.coolstuff.service;

import com.corlett.coolstuff.model.Node;

public class Reverse {

    public static Node reverseMe(Node head) {

        Node prev = null;
        Node next;

        while(head!= null) {
            next = head.getNext();
            head.setNext(prev);
            prev = head;
            head = next;
        }

        return prev;
    }

}
