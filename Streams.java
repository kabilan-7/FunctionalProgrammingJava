package functionalprogramming;

import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<Person> list=List.of(
                new Person("kabi","MALE"),
                new Person("hansika","FEMALE"),
                new Person("vijay","MALE")
        );
        list.stream().filter(person -> person.gender=="MALE").map(person -> person.name="ajith").forEach(System.out::println);

        //Declarative approach
        list.stream().map(person ->person.gender).collect(Collectors.toSet()).forEach(System.out::println);
    }

static class Person{
    String name;
    String gender;

    public Person(String name, String gender) {
        this.gender = gender;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
}

