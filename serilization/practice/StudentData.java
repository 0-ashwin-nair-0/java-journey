package com.serilization.practice;

import java.io.Serializable;

public class StudentData implements Serializable {
        int id;
        String name;
        StudentData(int id, String name){
            this.id = id;
            this.name = name;
        }
}
