package Streamscodes;
import java.util.List;
import java.util.Map;

public class StreamBasics {
    public static void main(String[] args) {
        List<String>names=List.of("Abhay","Abhishek","Ashar","Akshu","Sumith","Jaina","Gupta");
        names.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
