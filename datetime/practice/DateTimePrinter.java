package com.datetime.practice;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DateTimePrinter {
    public static void main(String[] args) {
        LocalDate todayDate = LocalDate.now();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the format you would like to print the date in\ndd for date, \nM for month, MM for zero padded month, MMM for abbreviated month, MMMM for full name, \nyy or yyyy for year");
        String strDateFormat = sc.nextLine();
        DateTimeFormatter newdateFormat = DateTimeFormatter.ofPattern(strDateFormat);
        System.out.println("\nThe date is "+todayDate.format(newdateFormat));
        LocalTime nowTime = LocalTime.now();
        System.out.println("\nEnter the format you would like to print the time in\nH for Hour of day (0-23), HH for Zero-padded hour of day (00-23), \nh for Hour of am/pm (1-12), hh for Zero-padded hour of am/pm (01-12) \nm for Minute of hour (0-59)\nmm for Zero-padded minute of hour (00-59)\ns for Second of minute (0-59), ss for Zero-padded second of minute (00-59)");
        String strTimeFormat = sc.nextLine();
        DateTimeFormatter newTimeFormat = DateTimeFormatter.ofPattern(strTimeFormat);
        System.out.println("The time is: "+nowTime.format(newTimeFormat));
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println(nowDateTime);
        System.out.println("\nEnter the format you would like to print the date and time in\\n");
        String strDateTimeFormat = sc.nextLine();
        DateTimeFormatter newDateTimeFormat = DateTimeFormatter.ofPattern(strDateTimeFormat);
        System.out.println("The date and time is: "+nowDateTime.format(newDateTimeFormat));

    }
}
