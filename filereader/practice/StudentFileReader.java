package com.filereader.practice;

import java.io.FileReader;
import java.io.IOException;

public class StudentFileReader {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("demo.txt");
            int ch;
            while((ch=fr.read())!=-1){
                System.out.println((char)ch);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
