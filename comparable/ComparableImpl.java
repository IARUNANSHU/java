package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class StudentComparable implements Comparable<StudentComparable> {
    private int rollNumber;
    private String name;

    public StudentComparable(int rollNumber, String name) {
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
    public int compareTo(StudentComparable other) {
        // Natural ordering based on rollNumber
        return Integer.compare(this.rollNumber, other.rollNumber);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                '}';
    }
}

public class ComparableImpl {
    public static void main(String[] args) {
        List<StudentComparable> students = new ArrayList<>();
        students.add(new StudentComparable(3, "Alice"));
        students.add(new StudentComparable(1, "Bob"));
        students.add(new StudentComparable(2, "Charlie"));

        Collections.sort(students); // Sorts using the compareTo method

        for (StudentComparable student : students) {
            System.out.println(student);
        }
    }
}
