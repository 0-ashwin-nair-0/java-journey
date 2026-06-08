package com.java.dsa;
import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,2,4,5,6};
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1; i<arr.length;i++) {
            prefix[i] = prefix[i - 1] + arr[i];//previous + current
        }
        for(int j = 0;j< prefix.length;j++){
            System.out.print(prefix[j]+" ");
        }
        System.out.print("\nEnter the start range: ");
        int l = sc.nextInt();
        System.out.print("Enter the end range: ");
        int r = sc.nextInt();
        int sum = prefix[r] - prefix[l-1];
        System.out.print("The sum from "+l+" to "+r+" is "+sum);
    }
}
