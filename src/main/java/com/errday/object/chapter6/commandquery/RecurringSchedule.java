package com.errday.object.chapter6.commandquery;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;

public class RecurringSchedule {

    private String subject;
    private DayOfWeek dayOfWeek;
    private LocalTime from;
    private Duration duration;

    public RecurringSchedule(String subject, DayOfWeek dayOfWeek, LocalTime from, Duration duration) {
        this.subject = subject;
        this.dayOfWeek = dayOfWeek;
        this.from = from;
        this.duration = duration;
    }

    public String getSubject() {
        return subject;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public LocalTime getFrom() {
        return from;
    }

    public Duration getDuration() {
        return duration;
    }
}
