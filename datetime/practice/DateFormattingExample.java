package com.datetime.practice;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class DateFormattingExample {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatterDate = currentDate.format(formatter);
        System.out.println(formatterDate);
    }
}
