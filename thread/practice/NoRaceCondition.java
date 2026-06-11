package com.thread.practice;
class Counter{
    int count;
    //synchronized keyword makes it possible that only one method calls the
    //increment at a time
    //no race condition
    public synchronized void increment(){
         count++;
    }
        }


public class NoRaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

       Runnable obj1 = () -> {
           for(int i =1; i<=1000; i++){
               c.increment();
           }
       };

       Runnable obj2 = ()->{
           for(int i = 1; i<=1000; i++){
               c.increment();
           }
       };

       Thread t1 = new Thread(obj1);
       Thread t2 = new Thread(obj2);

       t1.start();
       t2.start();

       t1.join();
       t2.join();
//Threads are unpredictable - any value may come
        //we cannot directly control them
        System.out.println(c.count);
    }
}

//THREAD STATES
//NEW STATE - NEW THREAD CREATED EVERYTIME GOES INTO THIS
//RUNNABLE STATE - WHEN WE SAY START()
//RUNNING STATE  - WHEN YOUR THREAD IS ACTUALLY RUNNING IN THE CPU RUN();
//WAITING STATE -  TO KEEP THE THREAD ON HOLD SLEEP() / WAIT() - COME BACK USING NOTIFY() IT GOES TO RUNNABLE
//DEAD STATE - DIRECTLY STOP() - BUT SHOULD NOT USE
