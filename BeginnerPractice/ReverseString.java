package BeginnerPractice;

import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Trainer";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        System.out.println(rev);
    }
}
