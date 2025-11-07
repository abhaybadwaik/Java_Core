package streams;

import java.util.Arrays;
import java.util.List;

public class StreamExamples {
    public static void main(String[] args) {
    StreamExamples obj = new StreamExamples();
//    obj.even();
    obj.odd();
    }
    void even(){
        List<Integer> list = Arrays.asList(1,5,4,8,2,6);
        list.stream()
                .filter(n-> n%2==0)
                .sorted()
                .forEach(System.out::println);
    }
    void odd(){
        List<Integer> numbs = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        numbs.stream()
                .filter(n->n%2!=0)
                .forEach(System.out::println);

    }
}
