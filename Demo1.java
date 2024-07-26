package functionalprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {
        List<Person> list=List.of(
                new Person("kabi","MALE"),
                new Person("hansika","FEMALE"),
                new Person("vijay","MALE")
        );
        //Declarative approach
        String gen="MALE";
        list.stream().filter(person ->gen.equals(person.gender)).forEach(System.out::println);
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
