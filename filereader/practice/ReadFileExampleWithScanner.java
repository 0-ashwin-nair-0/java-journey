package com.filereader.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExampleWithScanner {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the name of the file you want to read: ");
            //FileReader is used to read the file, the file name is obtained from the user input
            Scanner fileScanner = new Scanner(new FileReader(sc.nextLine()));
//            loop through the file line by line
            while(fileScanner.hasNext()){
                String fileLine = fileScanner.nextLine();
                System.out.println(fileLine);
            }
            fileScanner.close();
        }catch(FileNotFoundException e){
            System.out.println("Error reading file "+e.getMessage());
        }
    }
}
