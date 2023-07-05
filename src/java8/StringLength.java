package java8;

import java.util.Optional;

public class StringLength {
    public static Optional<Integer> getStringLength(String input) {
        if (input == null) {
            return Optional.empty();
        }

        return Optional.of(input.length());
    }

    public static void main(String[] args) {
        String inputString = "Hello, World!";
        Optional<Integer> length = getStringLength(inputString);

        if (length.isPresent()) {
            System.out.println("Length of the string: " + length.get());
        } else {
            System.out.println("Input string is null.");
        }
    }
}

