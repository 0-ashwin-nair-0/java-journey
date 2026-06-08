package com.exceptionhandling.practice;

public class ExceptionUsingMethods {
    public void data(String name, int index){
        System.out.println("Hey Your Name: "+name);
        System.out.println("Character at "+index+" is: "+name.charAt(index));
    }

    public static void main(String[] args) {
        ExceptionUsingMethods eum = new ExceptionUsingMethods();
        try {
            eum.data("Kinjal", 6);
    }catch(Exception e){
            e.printStackTrace();//Prints full error
            //java.lang.StringIndexOutOfBoundsException: Index 6 out of bounds for length 6
            //	at java.base/jdk.internal.util.Preconditions$1.apply(Preconditions.java:55)
            //	at java.base/jdk.internal.util.Preconditions$1.apply(Preconditions.java:52)
            //	at java.base/jdk.internal.util.Preconditions$4.apply(Preconditions.java:213)
            //	at java.base/jdk.internal.util.Preconditions$4.apply(Preconditions.java:210)
            //	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:98)
            //	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
            //	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
            //	at java.base/java.lang.String.checkIndex(String.java:4917)
            //	at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:46)
            //	at java.base/java.lang.String.charAt(String.java:1616)
            //	at com.corejava.exceptionhandling.ExceptionUsingMethods.data(ExceptionUsingMethods.java:6)
            //	at com.corejava.exceptionhandling.ExceptionUsingMethods.main(ExceptionUsingMethods.java:12)
            System.out.println(e.getMessage());//to show message
            //Index 6 out of bounds for length 6
            System.out.println(e.toString());//exception info i.e java.lang.StringIndexOutOfBoundsException: Index 6 out of bounds for length 6
        }
    }
}
