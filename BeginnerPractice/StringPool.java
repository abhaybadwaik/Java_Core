package BeginnerPractice;
//class StringPool {
//    // main function
//    public static void main(String[] args)
//    {
//        String s1 = "abc";
//        String s2 = "abc";
//
//        // Note that this == compares whether
//        // s1 and s2 refer to same object or not
//        if (s1 == s2)
//            System.out.println("Yes");
//        else
//            System.out.println("No");
//    }
//}
// Program 2: Comparing two references to objects
// created using new operator.
import java.util.*;

// Driver Class
//class StringPool {
//    // main function
//    public static void main(String[] args)
//    {
//        String s1 = new String("abc");
//        String s2 = new String("abc");
//
//        // Note that this == compares whether
//        // s1 and s2 refer to same object or not
//        if (s1 == s2)
//            System.out.println("Yes");
//        else
//            System.out.println("No");
//    }
//}

//class StringPoolpublic{
//    public static void main(String[] args) {
//        String s1 = "Abhay";
//        String s2 = "Abhay";
//
//        System.out.println(s1 == s2); // true (same object from pool)
//
//        String s3 = new String("Abhay");
//
//        System.out.println(s1 == s3); // false (new object in heap, not pool)
//    }
//}
class StringPool{
    public static void main(String[]args){
        String a1="Eidiko";
        String a2="Eidiko";
        System.out.println(a1==a2);

        String a3= new String("Eidiko");
        System.out.println(a1==a3);
    }
}