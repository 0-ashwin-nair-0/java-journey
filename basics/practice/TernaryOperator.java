package com.basics.practice;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //if the condition is true the statement after ? will execute and if it is false the condition after : will execute
        String result = n%2==0 ? "Even" : "Odd";
        System.out.println(result);
    }
}
