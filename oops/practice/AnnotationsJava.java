package com.oops.practice;

import java.util.concurrent.ThreadPoolExecutor;

//As per the idea - we are asked to create a class that has a method showData
//And then create another class that extends the previous class and then override the
//method initialised in the previous class in the new class
//but due to typing error we added an extra s to the name of the method
//now this creates bug
//we think the output will be Detailed Report Passed but no
//The output is as Report Data is being showed
//As to make ths not happen again - we can use Annotations
//it helps in telling our intentions to the compiler
//Eg - using @Override above the second method will help compiler to understand
//Ah okay - this guy wants to override the previous declared method -
//this prevents from any typing errors

@Deprecated //It means like - use it but dont use it -- soon it will be removed
class Report{
    public void showData(){
        System.out.println("Report Data is being showed");
    }
}

class Details extends Report {
//USING HERE
    @Override
    public void showData(){
        System.out.println("Detailed Report Passed");
    }
}
public class AnnotationsJava {
    public static void main(String[] args) {
        Details obj = new Details();
        obj.showData();
    }
}
