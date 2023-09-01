package edu.wgu.d387_sample_code.l18n;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeConverter {

    // Take care when using that the difference in time does not cause the wrong day to be displayed for one of the dates.
    // This can happen for times less than 2am ET or greater than 7pm ET
    public static String getConvertedTimeStringForMeetingSplash(ZonedDateTime zonedDateTime) {
        ZoneId easternTimeZone = ZoneId.of("UTC-5");
        ZoneId mountainTimeZone = ZoneId.of("UTC-7");
        ZoneId utcTimeZone = ZoneId.of("UTC");

        ZonedDateTime easternTime = zonedDateTime.withZoneSameInstant(easternTimeZone);
        ZonedDateTime mountainTime = zonedDateTime.withZoneSameInstant(mountainTimeZone);
        ZonedDateTime utcTime = zonedDateTime.withZoneSameInstant(utcTimeZone);

        String minutes = ":" + utcTime.getMinute() + " ";
        String result = "Please join us for an online presentation held at the Landon Hotel on " +
                easternTime.getMonth().toString() + " " + easternTime.getDayOfMonth() + ", " +
                easternTime.getYear() + " at " +
                easternTime.getHour() + minutes + "ET | " +
                mountainTime.getHour() + minutes + "MT | " +
                utcTime.getHour() + minutes + "UTC";

        return result;
    }
}
