package com.corlett.coolstuff.util;

import com.corlett.coolstuff.model.Node;

import java.util.List;

public class Utility {


    public static void print(Node node) {
        System.out.println(stringify(node));
    }

    public static void print_LL(Node head) {

        while(head.getNext()!=null) {
            System.out.print(head.getContent() + "-> ");
            head = head.getNext();
        }
        System.out.println();
    }

    public static Node buildLinkedList(List<String> linkedList) {

        Node prev = null;
        Node curr;
        Node head = new Node();

        for(int i = 0; i< linkedList.size(); i++) {
            curr = new Node(linkedList.get(i));

            //hooking up next
            if(prev != null) {
                prev.setNext(curr);
            }

            //saving head pointer
            if(i == 0 ){
                head = curr;
            }

            prev = curr;
        }

        return head;
    }

    public static String stringify(Node head) {

        StringBuilder sb = new StringBuilder();


        while(head.getNext() != null) {

            sb.append(head.getContent());
            sb.append(" -> ");
            head = head.getNext();
        }

        //don't forget the last node
        sb.append(head.getContent());

        return sb.toString();
    }

    public static void printMatrix(String[][] matrix) {

        System.out.println("Printing Matrix");

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print("[" + matrix[i][j] + "]");

            }
            System.out.println();
        }
    }
}
