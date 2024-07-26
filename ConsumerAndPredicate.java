package functionalprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerAndPredicate {
    public static void main(String[] args) {
        List<Customer> list = new ArrayList<>();
        list.add(new Customer("kabilan", "228282832"));
        list.add(new Customer("barath", "22929214"));
        list.add(new Customer("vijay", "1224335754"));
        Consumer<Customer> getname = customer -> System.out.println(customer.Customername);
        Predicate<String> checkphno = phno -> phno.length() == 8;
        list.forEach( Consumer -> {
            if(checkphno.test(Consumer.customerPhno)){
                getname.accept(Consumer);
            }
        });
    }


    static class Customer {
        private final String Customername;
        private final String customerPhno;

        public Customer(String customername, String customerPhno) {
            Customername = customername;
            this.customerPhno = customerPhno;
        }

    }
}