package com.oops.practice;
//binding variable with methods is the encapsulation so that no one from outside can access the variable
class Human{
    //here private is used so that this variable is accessible inside the same class
    private int age;
    String name;

    //the variable age should only be accessible to other class using the method
    //should not be accessible directly

    //setter - this method is used to set the value to the variable
    //we can name anything not only setAge
    //but it should be readable writing any other name makes no sense like abc n all
    public void setAge(int a){
        age = a;
    }
    //getter - the variable age can only be accessible through this method
    public int getAge()
    {
        return age;
    }


}
public class HumanEncapsulation {

    public static void main(String[] args) {
//here the variables can be accessed from anywhere
        //it can be seen - but in  real world we want privacy - not all variables should be accessible
        Human obj = new Human();
       // obj.age = 25; //it will give error here!!
        obj.name = "Ashwin";
        System.out.println(obj.name);
        obj.setAge(25);//using the setAge method
        System.out.println(obj.getAge());

    }
}
