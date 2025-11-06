package BeginnerPractice;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1,2,5,5};

        for (int i = 0; i < arr.length; i++) {

            int count = 0;
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) count = 1;
            }
            if(count==0){
                for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate: " + arr[i]);
                    
                }}
            }
        }
    }
}
