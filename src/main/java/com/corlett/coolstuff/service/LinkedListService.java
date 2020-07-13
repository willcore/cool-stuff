package com.corlett.coolstuff.service;

import com.corlett.coolstuff.model.Node;

import java.util.HashMap;
import java.util.Map;

public class LinkedListService {

    public static Node detectCycle(Node head) {

        Map<String, Boolean> crossCheck = new HashMap<>();


        while(head.getNext()!=null) {
            if(crossCheck.containsKey(head.getContent())){
                return head;
            }
            crossCheck.put(head.getContent(),true);
            head = head.getNext();

        }

        return head;
    }

    public static Node detectCycleTricky(Node head) {

        Node skip = head.getNext();
        Node trail = head;

        while(head.getNext()!=null) {

            if(head == skip) {
                return trail;
            }
            trail = head;
            head = head.getNext();
            skip = skip.getNext().getNext();
        }

        return null;
    }
}
