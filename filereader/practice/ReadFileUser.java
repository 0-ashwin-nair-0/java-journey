package com.filereader.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.util.Scanner;

public class ReadFileUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter the path of the file you want to read (or type \"exit\" to quit): ");
            String userInput = sc.nextLine();
            if(userInput.equalsIgnoreCase("exit")){
                System.out.println("Closing the system!");
                break;
            }
            else{
                try{
                Scanner fileScanner = new Scanner(new FileReader(userInput));
                while(fileScanner.hasNext()){
                    String fileContent =fileScanner.nextLine();
                    System.out.println(fileContent);
                }
            }catch (FileNotFoundException e){
                    System.out.println("File not found! "+e.getMessage());
                }
            }
        }
    }
}
