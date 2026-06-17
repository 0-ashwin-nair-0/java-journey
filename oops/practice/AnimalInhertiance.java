package com.oops.practice;

public class AnimalInhertiance {
    private String name;
    public AnimalInhertiance(String name)
    {
        this.name = name;
    }

    public String sound(){
        return  null;
    }

    public String toString()
    {
        return name.concat(" says ").concat(sound());

    }
}
