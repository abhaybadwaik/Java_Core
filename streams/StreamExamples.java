package streams;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {
    public static void main(String[] args) {
        StreamExamples obj = new StreamExamples();

    }

    void even() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .sorted()
                .forEach(System.out::println);
    }

    void greaterThan() {
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        num.stream()
                .filter(n -> n > 5)
                .sorted()
                .forEach(System.out::println);
    }

    void odd() {
        List<Integer> numbs = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbs.stream()
                .filter(n -> n % 2 != 0)
                .forEach(System.out::println);


    }

    void oddNumSum() {
        List<Integer> nums = Arrays.asList(1, 2, 4, 5, 6, 7, 8, 9, 10);
        int sum = nums.stream()
                .filter(n -> n % 2 != 0)
                .mapToInt(n -> n)
                .sum();
        System.out.println("Sum of Odd Num is " + sum);
    }

    void startsWith() {
        List<String> names = Arrays.asList("alice", "bob", "anna", "alex", "john");
        String result = names.stream()
                .filter(n -> n.startsWith("a"))
                .map(String::toUpperCase)
                .collect(Collectors.joining(","));
        System.out.println(result);
    }

    void firstName3() {
        List<String> names = Arrays.asList("bob", "anna", "alex", "john");
        names.stream()
                .filter(n -> n.length() > 3)
                .findFirst()
                .ifPresent(System.out::println);
    }
    void even() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .sorted()
                .forEach(System.out::println);
    }

}
