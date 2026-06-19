package com.filereader.practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the file you want to read: ");
        Path filePath = Paths.get(sc.nextLine());//Gets a file path from the user input and converts it into path object
        try{
            String content = Files.readString(filePath);
            System.out.println(content);
        }catch(IOException e){
            System.out.println("Error reading the file: "+e.getMessage());
        }
    }
}
