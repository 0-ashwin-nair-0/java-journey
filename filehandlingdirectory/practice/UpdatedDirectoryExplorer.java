package com.filehandlingdirectory.practice;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class UpdatedDirectoryExplorer {
    public static void fileManagement(File file)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Press 1 to rename the file.\nPress 2 to delete the file.\nAny other key to exit.\nEnter your choice: ");
        String userChoice = sc.nextLine();

        if(userChoice.equals("1"))
        {
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Press 1 for file management.\nAny other key to exit.\nEnter your choice: ");
            String userAction = sc.nextLine();
            if(userAction.equals("1")){
                System.out.print("Enter the name of the file or the directory with the path: ");
                String fileName = sc.nextLine();

                File file = new File(fileName);
                if(file.exists())
                {
                    if(file.isFile())
                    {
                        System.out.println(fileName+" is a file.");
                    }
                    else{
                        System.out.println(fileName+" is a directory.");
                    }
                }
                else{
                    System.out.println(fileName+" is not a valid file or directory");
                    System.out.print("To create a new file with the given name press 1.\nTo create a directory with given name press 2.\nTo do nothing and continue, press any other key.\nEnter your choice: ");
                    String createChoice = sc.nextLine();

                    if(createChoice.equals("1"))
                    {
                        String parentDirStr = file.getParent();
                        File parentDir = new File(parentDirStr);

                        if(!parentDir.exists())
                        {
                            boolean created = parentDir.mkdirs();
                            if(!created)
                            {
                                System.out.println("The parent directory could not be created.");
                                continue;
                            }
                        }
                        try{
                            file.createNewFile();
                            System.out.println("File created successully!");
                        }catch(IOException e){
                            System.out.println("Unable to create file. "+e.getMessage());
                        }
                    } else if (createChoice.equals("2")) {
                        boolean created = file.mkdirs();
                        if(created)
                        {
                            System.out.println("The directory has been created.");
                        }
                        else{
                            System.out.println("The directory couldn't be created");
                        }
                    }
                }

            }else {
                System.out.println("Closing");
                break;

            }
        }
    }
}
