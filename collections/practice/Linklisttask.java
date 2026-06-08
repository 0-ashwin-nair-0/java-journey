package com.collections.practice;

import java.util.LinkedList;

public class Linklisttask {
    public static void main(String[] args) {
        LinkedList<String> alphabets = new LinkedList<>();
        alphabets.add("A");
        alphabets.add("B");
        alphabets.add("C");
        System.out.println(alphabets);
        //TO ADD ELEMENTS AT FIRST POSITION AND LAST POSITION
        alphabets.addFirst("START");
        alphabets.addLast("LAST");
        System.out.println(alphabets);
        //REMOVE ELEMENT AT FIRST POSITION
        alphabets.removeFirst();
        System.out.println(alphabets);
        //TO GET ELEMENTS OF FIRST AND LAST POSITION
        System.out.println(alphabets.getFirst());
        System.out.println(alphabets.getLast());
    }
}
