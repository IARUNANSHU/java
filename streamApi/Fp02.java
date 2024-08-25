package streamApi;

import java.util.ArrayList;
import java.util.List;

class Student{
    int id;
    int age;
    String name;

    Student(int id, int age, String name){
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name=" + name +
                '}';
    }
}
public class Fp02 {
    public static void main(String[] args) {
        List<Student>li=new ArrayList<>();
        li.add(new Student(1, 20, "naveen"));
        li.add(new Student(2, 21, "kumar"));
        li.add(new Student(3, 22, "jena"));
        li.add(new Student(4, 23, "siva"));

        li.stream()
                .filter(s->s.getAge()%2==0)
                .forEach(p-> System.out.println(p.getName()));
    }
}
