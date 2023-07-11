package java8;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
    public static void main(String[] args) {
        // Example birthdate: 1990-07-15
        LocalDate birthdate = LocalDate.of(1990, 7, 15);
        LocalDate currentDate = LocalDate.now();

        Period age = Period.between(birthdate, currentDate);
        int years = age.getYears();
        int months = age.getMonths();
        int days = age.getDays();

        System.out.println("Age: " + years + " years, " + months + " months, " + days + " days");
    }
}

