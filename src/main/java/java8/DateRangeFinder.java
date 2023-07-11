package java8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DateRangeFinder {
    public static void main(String[] args) {

        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(2022, 6, 1));
        dates.add(LocalDate.of(2023, 1, 15));
        dates.add(LocalDate.of(2021, 9, 30));
        dates.add(LocalDate.of(2022, 12, 10));

        LocalDate earliestDate = dates.stream().min(LocalDate::compareTo).orElse(null);
        LocalDate latestDate = dates.stream().max(LocalDate::compareTo).orElse(null);

        System.out.println("Earliest date: " + earliestDate);
        System.out.println("Latest date: " + latestDate);
    }
}
