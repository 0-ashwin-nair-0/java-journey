package com.datetime.practice;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
public class DifferentTimeZone {
    public static void main(String[] args) {

        ZonedDateTime meetingtimeUTC = ZonedDateTime.parse("2024-12-30T15:00:00Z");

        String[] participantTimeZones = {"America/New_York","Europe/London", "Asia/Kolkata","Australia/Sydney"};

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        System.out.println("Meeting time in UTC: "+meetingtimeUTC.format(formatter));
        for(String timeZone : participantTimeZones)
        {
            ZonedDateTime localtime = meetingtimeUTC.withZoneSameInstant(ZoneId.of(timeZone));
            System.out.println("Meeting time in "+timeZone+": "+localtime.format(formatter));
        }
    }

}
