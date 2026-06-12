package com.java.dsa;

import java.io.*;                 // Classes for input and output operations
import java.time.LocalDate;       // Represents a date (year-month-day)
import java.time.DayOfWeek;       // Enum representing days of the week
import java.time.format.TextStyle;// Used to display the day name in different styles
import java.util.Locale;          // Represents a specific geographical, political, or cultural region

class Result {

    /*
     * Function Name: findDay
     *
     * Purpose:
     * Given a month, day, and year,
     * determine which day of the week it falls on.
     *
     * Example:
     * Input: 8, 5, 2015
     * Output: WEDNESDAY
     */
    public static String findDay(int month, int day, int year) {

        // Create a LocalDate object using the given year, month, and day.
        // LocalDate stores only the date (no time or timezone).
        LocalDate date = LocalDate.of(year, month, day);

        // Ask Java which day of the week this date corresponds to.
        // Example: 2015-08-05 → WEDNESDAY
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        // Convert the enum value into a readable English word.
        // TextStyle.FULL gives the complete name like "Wednesday"
        // Locale.ENGLISH ensures the output is in English.
        String finalDay = dayOfWeek.getDisplayName(
                TextStyle.FULL,
                Locale.ENGLISH
        );

        // HackerRank expects the answer in uppercase.
        // Example: "Wednesday" → "WEDNESDAY"
        return finalDay.toUpperCase();
    }
}

public class DaySolution {

    public static void main(String[] args) throws IOException {

        /*
         * BufferedReader is used to read input efficiently.
         * It reads the input as text (String).
         *
         * System.in represents the keyboard input stream.
         * InputStreamReader converts bytes into characters.
         * BufferedReader improves performance by buffering the input.
         */
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));

        /*
         * HackerRank provides OUTPUT_PATH as an environment variable.
         * BufferedWriter is used to write output efficiently.
         */
        BufferedWriter bufferedWriter =
                new BufferedWriter(
                        new FileWriter(System.getenv("OUTPUT_PATH"))
                );

        /*
         * Read the entire input line.
         *
         * Example Input:
         * 8 5 2015
         *
         * readLine()               → "8 5 2015"
         * replaceAll("\\s+$","")   → removes trailing spaces if any
         * split(" ")               → ["8", "5", "2015"]
         */
        String[] firstMultipleInput =
                bufferedReader.readLine()
                        .replaceAll("\\s+$", "")
                        .split(" ");

        // Convert the first value from String to int.
        // "8" → 8
        int month = Integer.parseInt(firstMultipleInput[0]);

        // Convert the second value from String to int.
        // "5" → 5
        int day = Integer.parseInt(firstMultipleInput[1]);

        // Convert the third value from String to int.
        // "2015" → 2015
        int year = Integer.parseInt(firstMultipleInput[2]);

        // Call the function to determine the day of the week.
        String res = Result.findDay(month, day, year);

        // Write the result to the output file.
        bufferedWriter.write(res);

        // Move to the next line.
        bufferedWriter.newLine();

        // Close the input stream to release resources.
        bufferedReader.close();

        // Close the output stream to ensure everything is written properly.
        bufferedWriter.close();
    }
}