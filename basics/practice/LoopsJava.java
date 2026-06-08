package com.basics.practice;

public class LoopsJava {
    //there are loops in java such as - for loop / while loop / do while loop
    //when condition is known we use for loop
    //when condition is not known we use while loop
    //when we need to run anything for atleast one time - then do while

    public static void main(String[] args) {

        for(int j = 0; j <= 5 ;j ++) {
            System.out.println("Run "+j);
        }

        int i =1;
        while(i<=4){
            System.out.println("Helloooo " + i);
            i++;
        }
        //it will print byee and 5 because the condition became false as it became 5
        System.out.println("Byee "+ i);
    }
}
