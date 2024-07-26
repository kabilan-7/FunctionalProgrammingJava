package functionalprogramming;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getstring());
        System.out.println(supplier.get());
        System.out.println(listSupplier.get());
    }
    static String getstring(){
        return "Hello friends...";
    }
    static Supplier<String> supplier=()->"Hello guys..";
    static Supplier<List<String>> listSupplier=()->List.of("welcome back..","welcome2");
}
