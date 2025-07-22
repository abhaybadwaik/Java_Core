import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main{

    public static void main(String[] args) {

        MyAnimal tigerObj = ()->{

        };
        ArrayList<Integer> l = new ArrayList<>();
        MyComparator obj = new MyComparator();

        l.sort(obj);
    }


}

class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 -o1;
    }
}


interface MyAnimal{


    void legs();
    default void method(){
        System.out.println("concrete method");
    }
}
