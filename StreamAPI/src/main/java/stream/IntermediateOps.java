package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOps {
    public static void main(String [] args){
        //Intermediate operations transform a stream into another stream.
        //They are lazy, meaning they don't execute until a terminal operation is invoked.

        List<String> list = Arrays.asList("Akshit", "ARam", "AShyam", "AGanesh");
        System.out.println(list.stream().filter(x -> x.startsWith("A")).limit(3).collect(Collectors.toList()));
    }
}
