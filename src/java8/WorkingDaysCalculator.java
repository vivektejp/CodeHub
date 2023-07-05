package java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class WorkingDaysCalculator {
    public static void main(String[] args) {

        LocalDate startDate = LocalDate.of(2023, 7, 10);

        LocalDate endDate = startDate.withDayOfMonth(startDate.lengthOfMonth());
        System.out.println("enddate: "+endDate);
        long workingDays = 0;

        while (!startDate.isAfter(endDate)) {
            if (startDate.getDayOfWeek() != DayOfWeek.SATURDAY && startDate.getDayOfWeek() != DayOfWeek.SUNDAY) {
                workingDays++;
            }
            startDate = startDate.plusDays(1);
        }

        System.out.println("Number of working days until the end of the month: " + workingDays);
    }
}
