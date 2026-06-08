package com.serilization.practice;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class StudentProgram {
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.txt"));
        StudentData s = (StudentData) ois.readObject();
        System.out.println(s.id +" "+ s.name);
        ois.close();
    }
}
