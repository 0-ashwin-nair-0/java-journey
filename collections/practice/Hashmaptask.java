package com.collections.practice;

import java.util.HashMap;
import java.util.Map;

public class Hashmaptask {
    public static void main(String[] args) {
        HashMap<Integer, String> keyset = new HashMap<>();
        keyset.put(100,"Ashwin");
        keyset.put(101,"Ashish");
        keyset.put(102, "David");
        System.out.println(keyset);
        System.out.println(keyset.get(102));
        keyset.put(102, "Madara");
        System.out.println(keyset);
        //loop for just printing the keys
        for(Integer key: keyset.keySet()){
            System.out.println(key);
        }
        //loop for just printing the values
        for(String values:keyset.values()){
            System.out.println(values);}
        //for getting both value and key
        for(Map.Entry<Integer, String> entry:keyset.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
