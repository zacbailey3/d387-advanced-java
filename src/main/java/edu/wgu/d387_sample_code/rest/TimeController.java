package edu.wgu.d387_sample_code.rest;

import edu.wgu.d387_sample_code.util.TimeZoneUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class TimeController {

    @GetMapping("/presentation-time")
    public Map<String, String> getPresentationTime() {

        // 1:00 PM Eastern Time
        LocalDateTime presentationTime =
                LocalDateTime.of(2025, 1, 15, 13, 0);

        ZonedDateTime et = TimeZoneUtil.convertTime(
                presentationTime,
                ZoneId.of("America/New_York"),
                ZoneId.of("America/New_York"));

        ZonedDateTime mt = TimeZoneUtil.convertTime(
                presentationTime,
                ZoneId.of("America/New_York"),
                ZoneId.of("America/Denver"));

        ZonedDateTime utc = TimeZoneUtil.convertTime(
                presentationTime,
                ZoneId.of("America/New_York"),
                ZoneId.of("UTC"));

        Map<String, String> times = new LinkedHashMap<>();
        times.put("ET", et.toLocalTime().toString());
        times.put("MT", mt.toLocalTime().toString());
        times.put("UTC", utc.toLocalTime().toString());

        return times;
    }
}
