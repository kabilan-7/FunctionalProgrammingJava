package functionalprogramming;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
   Customer customer1= new Customer("kabilan","6382433776");
   //Using consumer functional interface
   greetconsumer.accept(customer1);
   greetconsbifunction.accept(customer1,false);
    }
    static Consumer<Customer> greetconsumer=customer -> System.out.println("Hello "+customer.Customername+
            " Thank you for registering phone number " + customer.customerPhno);
    static Consumer<Customer> getconsumername=customer -> System.out.println(customer.Customername);

    static BiConsumer<Customer,Boolean> greetconsbifunction=((customer, b) -> System.out.println("Hello "+customer.Customername+
            " Thank you for registering phone number " +
            (b?customer.customerPhno:"******")));
    static class Customer {
      private final  String Customername;
      private final String customerPhno;

        public Customer(String customername, String customerPhno) {
            Customername = customername;
            this.customerPhno = customerPhno;
        }
    }
}

