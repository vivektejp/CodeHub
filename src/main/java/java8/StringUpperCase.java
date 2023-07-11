package java8;

import java.util.Optional;

public class StringUpperCase {
    public static Optional<String> convertToUpperCase(Optional<String> inputOptional) {
        if (inputOptional.isEmpty()) {
            return Optional.empty();
        }

        String input = inputOptional.get();
        String upperCaseString = input.toUpperCase();
        return Optional.of(upperCaseString);
    }

    public static void main(String[] args) {
        Optional<String> inputOptional = Optional.of("Hello, World!");
        Optional<String> resultOptional = convertToUpperCase(inputOptional);

        if (resultOptional.isPresent()) {
            System.out.println("Uppercase string: " + resultOptional.get());
        } else {
            System.out.println("Input Optional is empty.");
        }
    }
}

