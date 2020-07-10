package com.corlett.coolstuff.service;

import com.corlett.coolstuff.model.Node;

import java.util.HashMap;
import java.util.Map;

public class LinkedListService {

    public static Node detectCycle(com.corlett.coolstuff.model.Node head) {

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
}
