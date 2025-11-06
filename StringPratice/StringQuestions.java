package StringPratice;

public class StringQuestions {
    public static void main(String[] args) {
     StringQuestions obj = new StringQuestions();
//     obj.checkPalindrome();
     obj.VowelConsonants();
    }
    void checkPalindrome(){
        String str = "civic";
        String reversed ="";

        for(int i=str.length()-1; i>=0; i--){
            reversed = reversed + str.charAt(i);
        }
        if(str.equals(reversed)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }

    void VowelConsonants(){
        String str = "Abhay";
        str = str.toLowerCase();  // make it lowercase for easy checking

        int vowels = 0, consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // check if character is a letter
            if (ch >= 'a' && ch <= 'z') {
                // check if vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
