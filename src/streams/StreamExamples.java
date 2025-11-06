package streams;

import java.util.Arrays;
import java.util.List;

public class StreamExamples {
    public static void main(String[] args) {
    StreamExamples obj = new StreamExamples();
    obj.even();
    }
    void even(){
        List<Integer> list = Arrays.asList(1,5,4,8,2,6);
        list.stream()
                .filter(n-> n%2==0)
                .sorted()
                .forEach(System.out::println);
    }
}
