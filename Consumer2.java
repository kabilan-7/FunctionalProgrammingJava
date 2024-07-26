package functionalprogramming;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

class Student{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
public class Consumer2 {
    public static void main(String[] args) {
        Student s1=new Student(2,"kabilan");
        Consumer<Student> c1=student -> System.out.println(student.id + " " + student.name);
        Consumer<Student> c2=student -> System.out.println( " " + student.name);
        c1.accept(s1);

    }
}
