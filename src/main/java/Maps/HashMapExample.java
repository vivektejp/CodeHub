package Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Student {
    private String firstName;
    private String lastName;
    private double gpa;

    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Student> studentMap = new HashMap<>();
        studentMap.put("vivek", new Student("vivek", "CIS", 3.5));
        studentMap.put("rohith", new Student("rohith", "CIS", 3.8));
        studentMap.put("krupa", new Student("krupa", "CIS", 3.2));
        studentMap.put("nag", new Student("nag", "CIS", 3.9));

        System.out.println("HashMap Contents (using entry set):");
        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            String key = entry.getKey();
            Student student = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + student);
        }

        System.out.println("\nHashMap Contents (using forEach method):");
        studentMap.forEach((key, student) -> System.out.println("Key: " + key + ", Value: " + student));

        System.out.println("\nHashMap Contents (using keySet and iterator):");
        Iterator<String> iterator = studentMap.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Student student = studentMap.get(key);
            System.out.println("Key: " + key + ", Value: " + student);
        }
    }
}
