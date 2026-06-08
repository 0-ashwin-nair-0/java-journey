package com.basics.practice;

import java.util.Scanner;

class Thing{
    public void itemPrice(){
        System.out.println("Pen - 10rs\nPencil - 5rs\nPaper - 15rs");
    }
    public String buyItem(int money){

        return "Order Placed";
    }
}
public class ShopMethod {
    public static void main(String[] args) {
        Thing t1 = new Thing(); //creating object
        t1.itemPrice();//calling the methods
        t1.buyItem(15);
    }
}
