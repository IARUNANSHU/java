package streamApi;

import java.util.*;
import java.util.stream.Collectors;

public class Fp04 {
    private static List<Emp> createList(){
        List<Emp> empList=new ArrayList<>();

        empList.add(new Emp("Arunanshu",20,"technical",20000.0,"male",2015));
        empList.add(new Emp("satyajit",21,"commerce",23000.0,"male",2018));
        empList.add(new Emp("soumya",22,"technical",30000.0,"female",2013));
        empList.add(new Emp("chanda",23,"commerce",25000.0,"male",2023));
        empList.add(new Emp("suman",28,"sports",10000.0,"female",2009));

        return empList;
    }

    public static void main(String[] args) {


        List<Emp> li=createList();

        //oldest employee
        System.out.println(li.stream().max(Comparator.comparing(Emp::age)));

        //partition employee by age 22
        System.out.println(li.stream().collect(Collectors.partitioningBy(emp -> emp.age()>22)));

        //avg salary
        System.out.println(li.stream().collect(Collectors.averagingDouble(Emp::salary)));
        System.out.println(li.stream().collect(Collectors.summingDouble(Emp::salary)));
        //total

        //avg salary of male female employee
        System.out.println(li.stream().collect(Collectors.groupingBy(Emp::gender,Collectors.averagingDouble(Emp::salary))));

        //name of employee in each department
        li.stream().collect(Collectors.groupingBy(Emp::department,Collectors.mapping(Emp::name,Collectors.joining(", "))))
                .forEach((department,names)->{
                    System.out.print(" department "+department);
                    System.out.println(" name "+names);
                });


        //malefemale count in sale team
        System.out.println(
        li.stream().filter(p->p.department()=="commerce").collect(Collectors.groupingBy(Emp::gender,Collectors.counting())));


        //most working Experience
        Optional l2=li.stream().min(Comparator.comparing(Emp::joining));
        System.out.println(l2);

        //youngest employee in commerce
        Optional l=li.stream().filter(s->s.department()=="commerce").min(Comparator.comparing(Emp::age));
        System.out.println(l);


        //no of employee in each department
        System.out.println(
        li.stream().collect(Collectors.groupingBy(Emp::department,Collectors.counting())));

        //average salary in each department
        System.out.println(
                li.stream().collect(Collectors.groupingBy(Emp::department,Collectors.averagingDouble(Emp::salary)))
        );

        //avg age of male female emp
        System.out.println(
        li.stream().collect(Collectors.groupingBy(Emp::gender,Collectors.averagingInt(Emp::age))));

        //highest paid emp
        Optional l1=li.stream().max(Comparator.comparing(Emp::salary));
        System.out.println(l1);

        //name of the employee joined fater 2015
        li.stream().filter(s->s.joining()>2015).forEach(p-> System.out.println(p.name()));

        //peint all male and female emp
        System.out.println(
        li.stream().collect(Collectors.groupingBy(Emp::gender)));

        //print all the department in the organizartion
        Set<String>s = li.stream().map(e->e.department()).collect(Collectors.toSet());
        System.out.println(s);

        // print all the employees
        li.stream().forEach(p-> System.out.println(p.name()));

        //group employee by their department
        System.out.println(
        li.stream().collect(Collectors.groupingBy(Emp::department)));

        //count the employee by the gender
        System.out.println(li.stream().collect(Collectors.groupingBy(Emp::department,Collectors.counting())));

        //print all the employee in sorted manner according to the age


    }

}
