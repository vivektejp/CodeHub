package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterationExample {
    public static void main(String[] args) {
        HashSet<String> stringSet = new HashSet<>();


        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Cherry");
        stringSet.add("Durian");
        stringSet.add("Elderberry");
        stringSet.add("Fig");
        stringSet.add("Grapes");
        stringSet.add("Honeydew");
        stringSet.add("Ivy");
        stringSet.add("Jackfruit");


        System.out.println("Iterating HashSet using Iterator:");
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }


        System.out.println("\nIterating HashSet using ForEach:");
        for (String element : stringSet) {
            System.out.println(element);
        }


        System.out.println("\nIterating HashSet using Streams ForEach:");
        stringSet.stream().forEach(System.out::println);
    }
}

