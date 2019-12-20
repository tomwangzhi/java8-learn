package com.wz.client;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeClient {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.of(23, 59, 59);
        System.out.println(localTime);

        LocalDate localDate = LocalDate.of(2019, 12, 20);
        System.out.println(localDate);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;
        localDateTime.format(dateTimeFormatter);
        System.out.println(localDateTime);
    }
}
