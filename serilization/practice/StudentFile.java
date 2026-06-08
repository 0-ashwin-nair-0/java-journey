package com.serilization.practice;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class StudentFile{
    public static void main(String[] args) throws Exception {
        StudentData sd = new StudentData(51, "Ashwin");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.txt"));
        oos.writeObject(sd);
        oos.close();
    }
}
