package streamApi;

import java.util.*;
import java.util.stream.Collectors;

public class EmplList {
    public static void main(String[] args) {
        List<Empl> employeeList = new ArrayList<>();

        employeeList.add(new Empl(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Empl(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Empl(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Empl(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Empl(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Empl(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Empl(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Empl(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Empl(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Empl(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Empl(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Empl(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Empl(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Empl(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Empl(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Empl(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Empl(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        //1 How many male and female employees are there in the organization?
        Map<String,Long>mp=employeeList.stream().collect(Collectors.groupingBy(Empl::gender,Collectors.counting()));
        System.out.println(mp);

        //2 Print the name of all departments in the organization?
        Set<String>mp1=employeeList.stream().map(Empl::department).collect(Collectors.toSet());
        System.out.println(mp1);

        //3 What is the average age of male and female employees?
        Map<String,Double>mp2=employeeList.stream().collect(Collectors.groupingBy(Empl::gender,Collectors.averagingInt(Empl::age)));
        System.out.println(mp2);

        //4 Get the details of highest paid employee in the organization?
        Optional mp3= employeeList.stream().max(Comparator.comparing(Empl::salary));
        System.out.println(mp3);

        //5 Get the names of all employees who have joined after 2015?
        List<String>mp4=employeeList.stream().filter(e->e.yearOfJoining()>2015).map(e->e.name()).toList();
        System.out.println(mp4);

        //6 Count the number of employees in each department?
        Map<String,Long>mp5=employeeList.stream().collect(Collectors.groupingBy(Empl::department,Collectors.counting()));
        System.out.println(mp5);

        //7 What is the average salary of each department?
        Map<String,Double>mp6=employeeList.stream().collect(Collectors.groupingBy(Empl::department,Collectors.averagingDouble(Empl::salary)));
        System.out.println(mp6);

        //8 Get the details of youngest male employee in the product development department?
        Optional<Empl>mp7=employeeList.stream().filter(empl -> empl.department()=="Product Development").min(Comparator.comparing(Empl::age));
        System.out.println(mp7);

        //9 Who has the most working experience in the organization?
        Optional mp8=employeeList.stream().min(Comparator.comparing(Empl::yearOfJoining));
        System.out.println(mp8);

        //10 How many male and female employees are there in the sales and marketing team?
        Map<String,Long>mp9=employeeList.stream().filter(e->e.department()=="Sales And Marketing").collect(Collectors.groupingBy(Empl::gender,Collectors.counting()));
        System.out.println(mp9);

        //11 What is the average salary of male and female employees?
        Map<String,Double>mp10=employeeList.stream().collect(Collectors.groupingBy(Empl::gender,Collectors.averagingDouble(Empl::salary)));
        System.out.println(mp10);

        //12 List down the names of all employees in each department?
        Map<String,List<String>>mp11=employeeList.stream().collect(Collectors.groupingBy(Empl::department,Collectors.mapping(e->e.name(),Collectors.toList())));
        System.out.println(mp11);

        //13 What is the average salary and total salary of the whole organization?
        DoubleSummaryStatistics mp12=employeeList.stream().collect(Collectors.summarizingDouble(Empl::salary));
        System.out.println(mp12);

        //14 Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
        Map<Boolean,List<Empl>>mp13=employeeList.stream().collect(Collectors.partitioningBy(e->e.age()>=25));
        //System.out.println(mp13.entrySet().stream().map(E->E.getValue().stream().map(e->e.name()).toList()));
        System.out.println(
                mp13.get(true).stream().map(Empl::name).toList()
        );
        System.out.println(mp13.get(false).stream().map(Empl::name));
        //System.out.println(mp13);

        //15 Who is the oldest employee in the organization? What is his age and which department he belongs to?
        Optional<Empl>mp14=employeeList.stream().max(Comparator.comparing(Empl::age));
        System.out.println(mp14.get().name() + " " + mp14.get().age() + " " + mp14.get().department());
    }
}
