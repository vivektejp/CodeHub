package Day16;

import java.util.ArrayList;

public class RemoveLastObject {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        System.out.println("ArrayList before removal: " + list);

        if (!list.isEmpty()) {
            list.remove(list.size() - 1);
        }

        System.out.println("ArrayList after removal: " + list);
    }
}
