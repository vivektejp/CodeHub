package Day16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTraversal {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");
        stringList.add("date");

        // Using for loop
        System.out.println("Traversing using for loop:");
        for (int i = 0; i < stringList.size(); i++) {
            String element = stringList.get(i);
            System.out.println(element);
        }
        System.out.println();

        // Using enhanced for loop
        System.out.println("Traversing using enhanced for loop:");
        for (String element : stringList) {
            System.out.println(element);
        }
        System.out.println();

        // Using iterator
        System.out.println("Traversing using iterator:");
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
        System.out.println();

        // Using forEach
        System.out.println("Traversing using forEach:");
        stringList.forEach(System.out::println);
        System.out.println();

        // Using parallel stream
        System.out.println("Traversing using parallel stream:");
        stringList.parallelStream().forEach(System.out::println);
    }
}
