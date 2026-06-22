package com.filehandlingdirectory.practice;

import java.io.File;
import java.util.Scanner;

//java.io.File class is used to represent files and directories
//The file class provides getName() method to retrieve the file name
//The file class provides the list() method to retrieve a list of files and subdirectories within a directory
//File class provides the mkdir() method to create a new directory
public class DirectoryExplorer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the file or directory with the path: ");
        String fileName = sc.nextLine();
        File file = new File(fileName);
        if(file.exists())
        {
            if(file.isFile()){
            System.out.println(fileName+" is a file.");
        }
            else{
                System.out.println(fileName+" is a directory.");
            }
        }
        else{
            System.out.println(fileName+" is not a valid file or directory.");
        }
    }
}
