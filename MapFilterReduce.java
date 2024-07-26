package functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapFilterReduce {
    public static void main(String[] args) {
       int arr[]={1,2,3,4};
        int ans=Arrays.stream(arr).reduce(0,(a, b)-> a+b);
        List<Integer> list = Arrays.asList(1,2,3,3,3,3);
        list.stream().map(e->e+1).forEach(System.out::print);
        list.stream().collect(Collectors.toSet()).forEach(System.out::println);
        System.out.println(ans);

    }

}
