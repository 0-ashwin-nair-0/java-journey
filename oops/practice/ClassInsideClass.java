package com.oops.practice;

//cant make this static - it will throw error
class M
{
    //If a class is totally dependent on the class and theres no other need for it
    //In that case we can make a class inside a class

    String name;
    public void warm(){
        System.out.println("in warm");
    }
    //giving here static makes it accessible without creating object for this
    //if not then we have to create object

   static class N
    {
        public void config(){
            System.out.println("in config");
        }
    }
}

//ANONYMOUS CLASS
abstract class G{
    public abstract void plant();

}






public class ClassInsideClass {
    public static void main(String[] args) {
        M obj = new M();
        obj.warm();

        M.N obj1 = new M.N();
        obj1.config();

        //we are creating the object of anonymous object class - if only wants to implement
        //the abstract class only once we can use this
        G anonymous = new G()
        {
            public void plant() {
                System.out.println("In g show was");
            }

        }; //Anonymous class
    anonymous.plant();
    }

}
