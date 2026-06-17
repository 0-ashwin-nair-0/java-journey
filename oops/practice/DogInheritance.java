package com.oops.practice;

public class DogInheritance extends AnimalInhertiance{
    public DogInheritance(String name){
        super(name);
    }

    public String sound(){
        return "Dog Barks";
    }
}

class Cat extends AnimalInhertiance{
    public Cat(String name)
    {
        super(name);
    }

    public String sound(){
        return "Cat Meows";
    }

}
