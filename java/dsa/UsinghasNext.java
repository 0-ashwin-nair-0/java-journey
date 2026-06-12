package com.java.dsa;
import java.util.*;

public class UsinghasNext {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        while(sc.hasNext()){
            String input = sc.nextLine();
            System.out.println(i+" "+input);
            i++;
        }
    }
}