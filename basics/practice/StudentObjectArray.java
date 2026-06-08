package com.basics.practice;
class Student {
    int rollno;
    String name;
    int marks;
}
public class StudentObjectArray {
    public static void main(String[] args) {
        //new Student(); is object creation
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Ashwin";
        s1.marks = 100;

        Student s2 = new Student();
        s2.name = "Rajesh";
        s2.rollno = 51;
        s2.marks = 87;

        Student s3 = new Student();
        s3.name = "Madara";
        s3.rollno = 67;
        s3.marks = 99;

        Student[] student = new Student[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        for(int i = 0 ; i < student.length; i++){
            System.out.println(student[i].name);
            System.out.println(student[i].rollno);
            System.out.println(student[i].marks);
        }
    }
}
