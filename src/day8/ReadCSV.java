package day8;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadCSV {
    public static void main(String[] args) {
        String csvFile = "C:\\Users\\nagir\\IdeaProjects\\CodeHub\\src\\day8\\sample.csv";
        List<Student> studentList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            int lineNumber=1;
            while ((line = br.readLine()) != null ) {
                System.out.println(line);
                String[] data = line.split(",");
                for(int i=0;i< data.length;i++)
                    System.out.println(data[i]);
                if (data.length == 3 && lineNumber!=1)  {
                    String firstName = data[0];
                    String lastName = data[1];
                    int gpa = Integer.parseInt(data[2]);
                    Student student = new Student(firstName, lastName, gpa);
                    studentList.add(student);
                }
                lineNumber++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Collections.sort(studentList);

        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}

class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private int gpa;

    public Student(String firstName, String lastName, int gpa) {
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

    public int getGpa() {
        return gpa;
    }

    @Override
    public int compareTo(Student other) {
        return this.lastName.compareTo(other.lastName);
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
