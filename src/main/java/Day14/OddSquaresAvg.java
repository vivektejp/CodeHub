package Day14;

import java.util.Arrays;
import java.util.stream.Stream;

public class OddSquaresAvg {

    public static void main(String[] args) {
        int []  numbers= {21,22,23,24,25,26};

        double average = Arrays.stream(numbers)
                .filter(n -> n % 2 != 0)
                .mapToDouble(n -> Math.pow(n, 2))
                .average()
                .orElse(0);

        System.out.println("Average of squares of odd numbers: " + average);
    }
}
