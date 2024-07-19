package com.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeService {

    public String getCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return now.format(formatter);
    }
}
