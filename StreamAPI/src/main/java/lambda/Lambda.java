package lambda;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lambda {
    public static void main(String [] args){

        //predicate --> Functional interface (Boolean valued return function)
        Predicate<Integer> isEven = x -> x%2 == 0;
        Predicate<String> isWordStartingWithU = x -> x.toLowerCase().startsWith("u");
        Predicate<String> isWordEndingWithY = x -> x.toLowerCase().endsWith("y");
        boolean b  = isEven.test(4);
        System.out.println(b);
        System.out.println(isWordStartingWithU.test("uday"));
        System.out.println(isWordEndingWithY.test("uday"));
        //we can also use and for checking both conditions
        System.out.println(isWordStartingWithU.and(isWordEndingWithY).test("uday"));



        //Function --> works for you
        Function<Integer, Integer> doubleIt = x -> 2*x;

        System.out.println(doubleIt.apply(100));

        //consumer
        Consumer<Integer> consumer = x-> System.out.println(x);
        consumer.accept(10);
        List<Integer> list = Arrays.asList(1,2,3);
        Consumer <List<Integer>> printList = x ->{
            for(int i:x){
                System.out.println(i);
            }
        };
        printList.accept(list);

        //Method reference--> use method without invoking
        List<String> students = Arrays.asList("kella","uday","kumar");
        students.forEach(x -> System.out.println(x));
        students.forEach(System.out::println);
    }
}
