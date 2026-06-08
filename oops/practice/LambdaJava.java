package com.oops.practice;
interface Job{
    void jobTitle(int i);
}

public class LambdaJava {
    public static void main(String[] args) {
//        Job j1 = new Job() {
//            @Override
//            public void jobTitle() {
//
//            }
//        };
        //This is the way we do it before but now we can make it easy
        //lambda function
//we can write variables inside that round brackets
        Job j1 = (int i) -> { //lambda function
            System.out.println("in show "+ i);
        };
        //even the round brackets are not needed if only 1 variable is there
        //directly we can mention i
        //if we have only one statement as above then we can directly write in one line
        // no need of curly brackets or semi colon
        j1.jobTitle(56);
    }
    //using lambda function increases file size
}
