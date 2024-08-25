package comparable;

import java.util.*;

class Student {
    private int rollNumber;
    private String name;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                '}';
    }
}

class NameComparator implements Comparator<StudentComparable> {
    @Override
    public int compare(StudentComparable s1, StudentComparable s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

public class ComparatorImpl {
    public static void main(String[] args) {
        List<StudentComparable> students = new ArrayList<>();
        students.add(new StudentComparable(3, "Alice"));
        students.add(new StudentComparable(1, "Bob"));
        students.add(new StudentComparable(2, "Charlie"));

        Collections.sort(students, new NameComparator()); // Sorts using the custom comparator

        for (StudentComparable student : students) {
            System.out.println(student);
        }
    }
}

