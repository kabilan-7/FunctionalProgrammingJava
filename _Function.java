package functionalprogramming;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        int a=functionadd.apply(1);
        int mul=functionmul.apply(a);
        System.out.println(mul);
        Function<Integer,Integer> addandmul=functionadd.andThen(functionmul);
       int ans= addandmul.apply(1);
        System.out.println(ans);
        int ans1=biFunction.apply(2,2);
        System.out.println(ans1);

    }
    static Function<Integer,Integer> functionadd=number->number+1;
    static Function<Integer,Integer> functionmul=number -> number*10;
    static BiFunction<Integer,Integer,Integer> biFunction=(number1,number2)->(number1+1)*number2;
}
