package com.datetime.practice;
import java.time.LocalDateTime;
public class CurrentTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current date and time: "+now);
    }
}
