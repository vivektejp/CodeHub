package Day14;

import java.util.Arrays;
import java.util.Comparator;

public class SortString {
    public static void main(String[] args) {
        String[] strings = {"rohith", "banana", "vivek", "date", "one"};

        Arrays.stream(strings)
                .sorted(Comparator.comparingInt(String::length)
                        .thenComparing(Comparator.comparingInt((String s) -> s.charAt(s.length() - 1)).reversed()))
                .forEach(System.out::println);
    }
}
