package com.basics.practice;

public class UsingStringBuffer {
    public static void main(String[] args) {
      StringBuffer sb = new StringBuffer("Ashwin");
      //it will give a buffer size of 16 bytes
        //Now the capacity changes - and more space is allocated
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" Nair");
        System.out.println(sb);
        String str = sb.toString();
        //to convert to string from stringbuffer
        System.out.println(str);
        sb.deleteCharAt(4);
        System.out.println(sb);

        sb.insert(0, "Mr.");
        System.out.println(sb);

        sb.ensureCapacity(2);
        //StringBuffer and StringBuilder both are uused for same thing but the
        //difference is that StringBuffer is thread safe and StringBuilder is not

    }
}
