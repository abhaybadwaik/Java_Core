package streams;

import org.w3c.dom.ls.LSOutput;

import javax.print.DocFlavor;
import java.util.*;
import java.util.stream.Collectors;

public class StreamExamples {
    public static void main(String[] args) {
        StreamExamples obj = new StreamExamples();
        obj.duplicate();
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
    void flattenAndSort(){
        List<List<Integer>> numbers = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,5),
                Arrays.asList(6,7,8));
        List<Integer> result = numbers.stream()
                .flatMap(n->n.stream())
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(result);
    }
    void wordCount(){
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String,Long> result= words.stream()
                .collect(Collectors.groupingBy(n->n,Collectors.counting()));
        System.out.println(result);
    }
    void longestWord(){
        List<String> words = Arrays.asList("stream", "collector", "flatmap", "optional", "lambda");

   words.stream()
                .max(Comparator.comparingInt(String::length))
                .ifPresent(System.out::println);
    }
    void shortestWord(){
        List<String> names = Arrays.asList("Ab","abhay","royal","mumbai");
        names.stream()
                .min(Comparator.comparingInt(String::length))
                .ifPresent(System.out::println);
    }
    void duplicateElements() {
        List<Integer> elements = Arrays.asList(1, 2, 3, 4, 5, 5, 6, 7, 3, 2);

        Set<Integer> seen = new HashSet<>(); // keeps track of what we've seen

        List<Integer> duplicates = elements.stream()
                .filter(n -> !seen.add(n))      // add() returns false if element already exists
                .distinct()                     // remove repeated duplicates
                .collect(Collectors.toList());  // collect them into a list
        System.out.println("Duplicate elements: " + duplicates);
    }
    void duplicate(){
        List<Integer> nums = Arrays.asList(1,2,2,3,4,4,5);
        Map<Integer, Long> collect = nums.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        for (int i:collect.keySet())
            if(collect.get(i).intValue()>1) {
                System.out.println(collect.get(i));
            }
    }



}
