package com.basics.practice;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        //Unlike the old switch case where we are required to write the break everywhere after each cases
        //this is an alternate method
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        String result = "";
        switch(choice){
             case "Monday" , "Tuesday" -> System.out.println("Wow");
             case "Wednesday" -> result="Hahah"; //it will store the result
             default -> System.out.println("Byee");
        }
        System.out.println(result);
        //we can use arrow or else if we want to use : then we need to write keyword yield

        result = switch(choice){
            case "Monday" , "Tuesday" :yield "Okay";
            case "Wednesday" :yield "Okay";
            default :yield "Bye";
        };
        System.out.println(result);

    }

}
