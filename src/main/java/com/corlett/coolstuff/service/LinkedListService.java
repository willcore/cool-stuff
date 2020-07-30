package com.corlett.coolstuff.service;

import com.corlett.coolstuff.model.Node;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LinkedListService {

    public static boolean isThisLLaPalindrome(Node head) {

        Set<String> collection = new HashSet<>();

        while(head.getNext()!= null) {
            if(collection.contains(head.getContent())){
                collection.remove(head.getContent());
            } else {
                collection.add(head.getContent());
            }

            head = head.getNext();
        }

        //grabbing last node
        if(collection.contains(head.getContent())){
            collection.remove(head.getContent());
        } else {
            collection.add(head.getContent());
        }

        if(collection.size() < 2 ){
            return true;
        }

        return false;
    }

    public static Node removeDuplicate(Node head) {

        Node hold = head;
        Node tail = null;

        Map<String, Boolean> crossCheck = new HashMap<>();

        while(head.getNext()!=null) {
            if(crossCheck.containsKey(head.getContent())) {
                //remove dup logic
                tail.setNext(head.getNext());
            }
            tail = head;
            crossCheck.put(head.getContent(), true);
            head = head.getNext();

        }

        return hold;
    }

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
