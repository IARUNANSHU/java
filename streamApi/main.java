package streamApi;

import java.util.*;
import java.util.stream.Collectors;

class Customer {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String department;
    private int yearOfJoining;
    private double salary;

    // Constructor
    public Customer(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public int getYearOfJoining() { return yearOfJoining; }
    public void setYearOfJoining(int yearOfJoining) { this.yearOfJoining = yearOfJoining; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
}

public class main {


    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();

        customerList.add(new Customer(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        customerList.add(new Customer(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        customerList.add(new Customer(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        customerList.add(new Customer(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        customerList.add(new Customer(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));

        //1)  Get the names of all customers sorted by their age in descending order.
        //2) Group customers by department and count the number of employees in each department.

        Map<String,Long> cl= customerList.stream().collect(Collectors.groupingBy(Customer::getDepartment,Collectors.counting()));
        System.out.println(cl);

        customerList.stream().sorted(Comparator.comparing(Customer::getAge)).forEach(p->p.getName());

        customerList.stream().sorted(Comparator.comparing(Customer::getAge).reversed()).map(Customer::getName).forEach(System.out::println);
        System.out.println(customerList.stream().collect(Collectors.groupingBy(Customer::getDepartment, Collectors.counting())));
    }
}






