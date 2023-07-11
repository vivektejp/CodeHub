package HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "Hello, World!";
        String result = removeDuplicates(input);
        System.out.println("Result: " + result);
    }

    public static String removeDuplicates(String input) {
        HashSet<Character> uniqueChars = new HashSet<>();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!uniqueChars.contains(c)) {
                uniqueChars.add(c);
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
