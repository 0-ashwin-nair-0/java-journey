package com.basics.practice;
final class J{
    public void show(){
        System.out.println("Okay shown");
    }

    public void remove(){
        System.out.println("Okay Removed");
    }
}
//no one should be able to extend my class J so we will make it as final
//class H extends J{} - it will throw error - therefore no one can use it

class P {
    public void sponsor(){
        System.out.println("Ashwin is the sponsor");
    }

    final public void owner(){
        System.out.println("Ashwin is the owner");
    }
}
//Now if we want to prevent the method sponsor from overriding and changing the data
//we should add final keyword if not anyone can change the data
class K extends P{
    @Override
    public void sponsor(){
        System.out.println("John is the sponsor");
    }
//    it will throw error as the method is declared as final
//    @Override
//    public void owner(){
//        System.out.println("John is the owner");
//    }

}
public class KeywordFinal {
    public static void main(String[] args) {
        int num = 8;
        num = 9;
        System.out.println(num); // 8 changed to 9
        //but when we want to keep the value as constant we use final keyword

        final int age = 25;
        //age = 34; - will throw error
        System.out.println(age);
        // this is final variable
        J obj = new J();
        obj.show();
        obj.remove();

        System.out.println("=================");
        K obj1 = new K();
        obj1.sponsor(); //ashwin is changed to john - as to prevent it - we use final keyword
    }
}
