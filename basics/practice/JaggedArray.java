package com.basics.practice;

public class JaggedArray {
    public static void main(String[] args) {
        //jagged array is where we write the number of rows needed but dont specify the
        //number of columns - we manually declare for each row how many column is needed
        int[][] nums = new int[3][];
        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];

        for(int i = 0 ; i < nums.length; i++){

            for(int j = 0 ; j <nums[i].length; j++){
                nums[i][j] = (int)(Math.random() * 10);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("================");
        //using enhanced for loop
        for(int [] m : nums)
        {
            for(int n : m){
                System.out.print(n + " ");
            }
            System.out.println();
        }

    }
}
