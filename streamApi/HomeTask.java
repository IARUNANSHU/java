package streamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.*;

class Employees {

    Integer id;
    String name;
    Integer age;
    String gender;
    String department;
    Integer yearOfJoining;
    Double salary;


    public Employees(Integer id, String name, Integer age, String gender, String department, Integer yearOfJoining, Double salary) {

        this.id = id;

        this.name = name;

        this.age = age;

        this.gender = gender;

        this.department = department;

        this.yearOfJoining = yearOfJoining;

        this.salary = salary;
    }

    public int

    getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int

    getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "Id : " + id
                + ", Name : " + name
                + ", age : " + age
                + ", Gender : " + gender
                + ", Department : " + department
                + ", Year Of Joining : " + yearOfJoining
                + ", Salary : " + salary;
    }
}

public class HomeTask {

    public static void main(String[] args) {

        List<Employees> employeeList = new ArrayList<Employees>();
        employeeList.add(new Employees(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employees(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employees(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employees(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employees(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employees(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employees(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employees(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employees(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employees(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employees(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employees(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employees(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employees(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employees(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employees(255, "Ali Baig", 32, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employees(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employees(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));


        //1 question
        System.out.println("Counting the Numbers of Male and Female Employees");
        Map<String, Long> mp = employeeList.stream()
                .collect(Collectors.groupingBy(Employees::getGender, Collectors.counting()));

        System.out.println(mp);

        //2nd ques
        System.out.println("Printing the name of all the departments");
        List<String> ls = employeeList
                .stream()
                .map(e -> e.department)
                .toList();

        System.out.println(ls);

        //3 ques
        System.out.println("Find the Average Age of Male and Female Employee");
        Map<String, Double> mp1 = employeeList.stream()
                .collect(Collectors
                        .groupingBy(Employees::getGender, Collectors
                                .averagingInt(Employees::getAge)));
        System.out.println(mp1);

        //4 ques
        System.out.println("Find the details of highest paid Employee");

        Optional<Employees> mp2 = employeeList.stream()
                .collect(Collectors
                        .maxBy(Comparator
                                .comparing(Employees::getSalary)));
        System.out.println(mp2);

        //ques 5
        System.out.println("Find the Employees who joined after 2015");
        List<String> mp3 = employeeList.stream()
                .filter(e -> e.getYearOfJoining() > 2015)
                .map(e -> e.getName())
                .toList();

        System.out.println(mp3);

        //6 ques
        System.out.println("Find the count of each department");
        Map<String, Long> mp4 = employeeList.stream().collect(Collectors.groupingBy(Employees::getDepartment, Collectors.counting()));
        System.out.println(mp4);

        //7 ques
        System.out.println("Find the average salary of each department");
        Map<String, Double> mp5 = employeeList.stream().collect(Collectors.groupingBy(Employees::getDepartment, Collectors.averagingDouble(Employees::getSalary)));
        System.out.println(mp5);

        //8
        System.out.println("Find the youngest male in product development department");
        Optional<Employees> mp6 = employeeList.stream().filter(e -> e.getGender() == "Male" && e.getDepartment() == "Product Development").min(Comparator.comparing(Employees::getAge));

        System.out.println(mp6);

        //9
        System.out.println("Find the name of the person which have most work experience");
        List<String> mp7 = employeeList.stream().min((e1, e2) -> e1.getYearOfJoining() > e2.getYearOfJoining() ? 1 : -1).map(e -> e.name).stream().toList();
        System.out.println(mp7);

        //10
        System.out.println("Find the count of Male And Female in Sales And Marketing Department");
        Map<String, Long> mp8 = employeeList.stream().filter(e -> e.getDepartment() == "Sales And Marketing").collect(Collectors.groupingBy(Employees::getGender, Collectors.counting()));
        System.out.println(mp8);

        //11
        System.out.println("Find the average salary of male and female employee");
        Map<String, Double> mp9 = employeeList.stream().collect(Collectors.groupingBy(Employees::getGender, Collectors.averagingDouble(Employees::getSalary)));
        System.out.println(mp9);

        //12
        System.out.println("Find the name of employee from each department");
        Map<String, List<String>> mp10 = employeeList.stream().collect(Collectors.groupingBy(Employees::getDepartment, Collectors.mapping(Employees::getName, Collectors.toList())));
        System.out.println(mp10);

        //13
        DoubleSummaryStatistics mp11 = employeeList.stream().collect(Collectors.summarizingDouble(Employees::getSalary));
        System.out.println("Find the sum of salary from whole department");
        System.out.println(mp11.getSum());
        System.out.println("Find the average salary of whole department");
        System.out.println(mp11.getAverage());

        //14
        System.out.println("Find the employee separate by age greater and less than 25");
        Map<Boolean, List<String>> mp12 = employeeList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25, Collectors.mapping(Employees::getName, Collectors.toList())));
        System.out.println(mp12);
        //System.out.println(mp12.get(false).stream().collect(Collectors.mapping(Employee::getName, Collectors.toList())));

        System.out.println("Find the all the Details of oldest employee");
        List<Employees> mp13 = employeeList.stream().max((e1, e2) -> e1.getAge() > e2.getAge() ? 1 : -1).stream().toList();
        System.out.println(mp13);

        System.out.println("Reversing with Descending Order");
        List<Employees> mp14 = employeeList.stream().sorted(Comparator.comparing(Employees::getName).reversed()).toList();
        System.out.println(mp14);

        List<Employees> mp15 = employeeList.stream().sorted(Comparator.comparing(Employees::getName).thenComparing(Employees::getAge)).toList();
        System.out.println(mp15);

    }
}

