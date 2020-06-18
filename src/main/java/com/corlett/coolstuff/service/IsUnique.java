package com.corlett.coolstuff.service;

import java.util.HashMap;

public class IsUnique {

    public static boolean isUnique(String input) {

        HashMap<Character,Boolean> map = new HashMap<>();

        for(int i = 0; i< input.length(); i++) {

            if(map.containsKey(input.charAt(i))){
                return false;
            }
            map.put(input.charAt(i), true);
        }

        return true;
    }
}
