package com.oops.practice;

class Vehicle{
    String model;
    int price;

    public String toString(){
        return model + " " + price;
    }
    // that is the other variable with which the comparison will be done
    public boolean equals(Vehicle that){
        if(this.model.equals(that.model) && this.price == that.price){
            return true;
        }
        return false;
    }
    //but creating method is not good we should directly right click on the ide and click generate and then click hashcode and equals
}
public class ObjectClassMethods {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.model = "Car";
        v1.price = 250000;
        System.out.println(v1);//using toString above will now return the value

        Vehicle v2 = new Vehicle();
        v2.model = "Car";
        v2.price = 250000;

        boolean result = v1 == v2;//it will print false even though the values are same
        //because it checks the reference not the values
        //therefore we should use .equals() but still it will print false
        //because it checks the hexadecimal value rather than the actual value
        // as to make it work - we create a method and make it compare the actual values

        System.out.println(result);

        boolean resultnow = v1.equals(v2);
        System.out.println(resultnow);

    }}


