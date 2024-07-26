package functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("adam"

                , "dan", "jenny");

// Creating a Sequential Stream
        names.stream(); //or


// Creating a Parallel Stream
        names.parallelStream(); //or
        names.stream().parallel();

    }
}
