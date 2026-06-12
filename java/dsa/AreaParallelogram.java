package com.java.dsa;

import java.util.Scanner;

public class AreaParallelogram {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int breadth = sc.nextInt();
            int height = sc.nextInt();
            if(breadth > 0 && height > 0 ){
                int area = breadth * height;
                System.out.println(area);
            }
            else{
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
        }

    }

