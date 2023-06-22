package Maps;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
        String input = "test string";
        Map<Character, Integer> frequencyMap = new HashMap<>();


        for (char ch : input.toCharArray()) {

            if(!Character.isWhitespace(ch))
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);

        }

        System.out.println("Character Frequencies:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            char ch = entry.getKey();
            int frequency = entry.getValue();

            System.out.println(ch + "-" + frequency);
        }
    }
}
