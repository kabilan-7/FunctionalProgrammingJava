package functionalprogramming;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isValidPhoneNumber("0712123435"));
        System.out.println(predicate.test("0912344444"));
        System.out.println(predicate.and(contains3).test("0912123435"));
        System.out.println(predicate.or(contains3).test("0712123435"));
    }
    static boolean isValidPhoneNumber(String phno){
        return phno.startsWith("07") && phno.length()==10;
    }
    static Predicate<String> predicate=phno->phno.startsWith("07") && phno.length()==10;
    static Predicate<String> contains3=phno->phno.contains("3");


}
