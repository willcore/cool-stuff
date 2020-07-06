package com.corlett.coolstuff.service;

import com.corlett.coolstuff.model.BSTNode;

public class BinarySearchTreeService {

    /*
    Given a sorted (increasing order) array with unique integer elements,
    write an algo to create a BST with minimal height

    BONUS: Take an unsorted list of integers.
     */

    public static BSTNode minHeightBST(Integer[] array){
        //calling the algo
        return createBalancedBST(array, 0, array.length -1);
    }

    private static BSTNode createBalancedBST(Integer[] array, int start, int end) {

        if(start > end) {
            return null;
        }

        //getting middle element
        int middle = (start + end)/2;
        BSTNode midNode = new BSTNode(middle);

        //build left side of the tree
        midNode.setLeft(createBalancedBST(array, start, middle-1));
        //build right side of the tree
        midNode.setLeft(createBalancedBST(array, middle + 1, end));

        return midNode;
    }


}
