package functionalprogramming;

import java.util.function.Predicate;

class Student1{
    int id;
    String name;

    public Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
public class Predicate2 {
    public static void main(String[] args) {
        Student1 student1=new Student1(4,"ajith");
        Predicate<Student1> predicate = student -> student.id==2;
        System.out.println(predicate.test(student1));
    }
}
