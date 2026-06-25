package com.datetime.practice;
import java.time.ZonedDateTime;
public class ZoneDateTime {
    public static void main(String[] args) {
        ZonedDateTime zonedNow = ZonedDateTime.now();
        System.out.println("Current date and time with zone: "+zonedNow);
    }
}
