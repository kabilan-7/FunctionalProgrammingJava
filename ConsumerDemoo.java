package functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Employee{
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
public class ConsumerDemoo {
    void sum(int a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee(1, "kabi"),
                new Employee(2, "vinay")
        );

        Consumer<Employee> consumer = employee -> System.out.println(employee.name);
        list.forEach(employee -> consumer.accept(employee));
    }
}
