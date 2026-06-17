package com.basics.practice;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //row - column
        System.out.println("Enter the value of total rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the value of total columns: ");
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];
        for(int i =0;i<rows;i++){
            for(int j = 0; j<columns;j++){
// In a 2D int array:
// The outer array contains references to row arrays.
// Each row array contains the actual integer values (columns).

                matrix[i][j] = sc.nextInt();
            }
        }

        for (int[] c : matrix) {
            for (int value : c) {

                System.out.print(value + " ");
            }

            System.out.println();
        }
    }

}
