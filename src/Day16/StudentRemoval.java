package Day16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student {
    private String firstName;
    private String lastName;
    private double gpa;

    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (GPA: " + gpa + ")";
    }
}

public class StudentRemoval {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("vivek", "cis", 3.8));
        studentList.add(new Student("rohith", "cis", 3.5));
        studentList.add(new Student("nag", "cis", 3.2));
        studentList.add(new Student("krupa", "cis", 3.9));
        studentList.add(new Student("anurag", "cis", 3.6));

        double totalGpa = 0;
        for (Student student : studentList) {
            totalGpa += student.getGpa();
        }
        double averageGpa = totalGpa / studentList.size();

        System.out.println("Average GPA: " + averageGpa);
        System.out.println("Students before removal: " + studentList);

        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getGpa() < averageGpa) {
                iterator.remove();
            }
        }


        System.out.println("Students after removal: " + studentList);
    }
}
