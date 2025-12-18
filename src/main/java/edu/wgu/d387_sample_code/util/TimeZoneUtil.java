package edu.wgu.d387_sample_code.util;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZoneUtil {
    public static ZonedDateTime convertTime(
            LocalDateTime time,
            ZoneId fromZone,
            ZoneId toZone) {

        return time.atZone(fromZone).withZoneSameInstant(toZone);
    }
}
