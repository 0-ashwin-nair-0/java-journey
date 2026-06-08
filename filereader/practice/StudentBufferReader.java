package com.filereader.practice;

import java.io.BufferedReader;
import java.io.FileReader;

public class StudentBufferReader {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("demo.txt"));
        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
    }
}
