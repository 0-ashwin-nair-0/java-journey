package com.collections.practice;

import java.util.HashSet;

public class Employeetask {
    int id;
    String name;
    Employeetask(int id, String name) {
        this.id = id;
    }
    @Override
    public boolean equals(Object obj){
        Employeetask other = (Employeetask) obj;
        return this.id == other.id;
    }
    @Override
    public int hashCode(){
        return id;
    }

}
class Main{
    public static void main(String[] args) {
        HashSet<Employeetask> emp = new HashSet<>();
        emp.add(new Employeetask(101, "Ashwin"));
        System.out.println(emp.contains(new Employeetask(101,"Ashwin")));
    }
}
