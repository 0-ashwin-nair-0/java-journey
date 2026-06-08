package com.oops.practice;

enum Laptops{
    Lenovo, Dell(70000), Macbook(100000), ASUS(65000);
    private int price;

    private Laptops(){
        price = 25000;
    }
    private Laptops(int price){
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

}//values() is an array so we have to provide array or else there will be error
public class LaptopCostEnum {
    public static void main(String[] args) {
   // Laptops[] lp = Laptops.values(); - we can declare like this or else using enhanced for loop to display
    for(Laptops lp : Laptops.values()){
        System.out.printf("%-10s %d%n",lp +": ",lp.getPrice());
    }}
}
