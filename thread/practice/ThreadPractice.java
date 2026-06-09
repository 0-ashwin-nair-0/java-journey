package com.thread.practice;

class SafeWork extends Thread
{
    public void run(){
        for(int i = 1; i<=10 ; i++)
        {
            System.out.println("Hello Namaste");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class SafeWorkTwo extends Thread
{
    public void run(){
        for(int i = 1; i<=10 ; i++)
        {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class ThreadPractice {
    public static void main(String[] args) throws InterruptedException {
        SafeWork sw = new SafeWork();
        SafeWorkTwo swt = new SafeWorkTwo();
       // System.out.println(sw.getPriority());// it goes from 1 - 10 ( 1 least and 10 highest  5 normal) every thread will have normal priority
        //sw.setPriority(Thread.MAX_PRIORITY-1);//to set the priority
        sw.start();
        swt.start();
    }//start() - thread class method - it calls the run method so we should name method as run()
}//scheduler - if anything want to execute you have to come to me first
