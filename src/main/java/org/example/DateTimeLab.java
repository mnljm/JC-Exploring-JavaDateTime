package org.example;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Period;

public class DateTimeLab {
    public static void main(String[] args) {
        System.out.println("--Exercise 1: LocalDate and DateTimeFormatter--");
        LocalDate today = LocalDate.of(2025, 8, 21);
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy", Locale.ENGLISH);

        System.out.println("Default format: " + today);
        System.out.println("Custom format 1: " + today.format(dtf1));
        System.out.println("Custom format 2: " + today.format(dtf2));
        System.out.println();

        System.out.println("--Exercise 2: LocalTime and DateTimeFormatter--");
        LocalTime now = LocalTime.of(16,45,30);
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("hh:mm:ss a");

        System.out.println("Prediction: 16:45:30");
        System.out.println("Default format: " + now);
        System.out.println("Prediction: 16:45:30");
        System.out.println("24-hour format: " + now.format(dtf3));
        System.out.println("Prediction: 4:45:30 PM");
        System.out.println("12-hour format with AM/PM: " + now.format(dtf4));
        System.out.println();

        System.out.println("--Exercise 3: LocalDateTime and DateTimeFormatter--");
        LocalDateTime event = LocalDateTime.of(2025,11,27,19,0,0);
        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("MMM dd, yyyy 'at' hh:mm a");

        System.out.println("Default format: " + event);
        System.out.println("Prediction: Nov 27, 2025 at 7:00 PM");
        System.out.println("Custom format: " + event.format(dtf5));
        System.out.println();

        System.out.println("--Exercise 4: The Immutability of Date-Time Objects--");
        LocalDate startDate = LocalDate.of(2025, 9, 1);
        startDate.plusDays(10);

        System.out.println("Prediction: 2025-09-01");
        System.out.println("Start date after trying to modify it: " + startDate);
        LocalDate endDate = startDate.plusDays(10);

        System.out.println("The original start date is still: " + startDate);
        System.out.println("Prediction: 2025-09-11");
        System.out.println("The new end date is: " + endDate);
        System.out.println();

        System.out.println("--Exercise 5: Adding and Subtracting Time (plus and minus)");
        LocalDateTime baseTime = LocalDateTime.of(2025, 10, 15, 10, 30, 0);
        LocalDateTime futureTime = baseTime.plusYears(1).plusMonths(2).plusHours(5);
        LocalDateTime pastTime = baseTime.minusWeeks(3).minusDays(3);
        DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        System.out.println("Prediction: 2025-10-15 10:30");
        System.out.println("Base time: " + baseTime.format(dtf6));
        System.out.println("Prediction: 2026-12-15 15:30");
        System.out.println("Future time: " + futureTime.format(dtf6));
        System.out.println("Prediction: 2025-09-21 10:30");
        System.out.println("Past time: " + pastTime.format(dtf6));
        System.out.println();

        System.out.println("--Exercise 6: Period - Measuring a Span of Time--");
        LocalDate date1 = LocalDate.of(2024, 3, 15);
        LocalDate date2 = LocalDate.of(2026, 7, 20);

        Period period = Period.between(date1, date2);

        System.out.print("The period between the two dates is: ");
        System.out.println("Prediction: 2 years, 4 months, 5 days");
        System.out.print(period.getYears() + " years, ");
        System.out.print(period.getMonths() + " months, and ");
        System.out.println(period.getDays() + " days.");

    }
}