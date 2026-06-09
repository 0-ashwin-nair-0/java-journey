package com.thread.practice;

//class DataSource implements Runnable
//{
//    public void run(){
//        for(int i = 1; i <=100; i++) {
//            System.out.println("Hi "+i);
//            try{
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                System.out.println(e);
//            }
//        }
//
//        System.out.println("Hello");
//    }
//}

class DataSourceTwo implements Runnable{
    public void run(){
        for(int i = 1; i <= 100; i++){
        System.out.println("Hello "+i );}
        try{
            Thread.sleep(10);
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
public class RunnableJava {
    public static void main(String[] args) {
        Runnable ds = () -> {//Using lambda
            for(int i = 1; i <= 100; i++){
                System.out.println("Hello "+i );}
            try{
                Thread.sleep(10);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        };
        DataSourceTwo dst = new DataSourceTwo();
        //Runnable have no start method
        Thread t1 = new Thread(ds);
        Thread t2 = new Thread(dst);

        t1.start();
        t2.start();
    }
}
