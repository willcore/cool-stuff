package com.corlett.coolstuff.service;

import java.util.HashMap;

/**
 * Given a string, write a function to check if it is
 * a permutation of a palindrome. A Palindrome is a word
 * or phrase (think spaces) that is the same forward
 * and backward. A permutation is a rearrangement of letters.
 * This need not be limited to english dictionary words.
 */
public class PalindromePermute {

    //O(n) speed.
    public static boolean palindromePermutate(String input) {

        HashMap<Character, Boolean> map = new HashMap<>();

        //loop through and add/takeaway
        for(int i = 0; i < input.length(); i++) {

            Character currChar = Character.toLowerCase(input.charAt(i));

            if(currChar!= ' '){
                if(map.containsKey(currChar)) {
                    map.remove(currChar);
                } else {
                    map.put(currChar, true);
                }
            }
        }

        //if size is less than 2 than it a palindrome!
        if(map.size() < 2) {
            return true;
        }
        return false;
    }
}
