package ArrayPractice;

public class ArrayQuestions {
    public static void main(String[] args) {
        ArrayQuestions obj = new ArrayQuestions();
        obj.SecondLargest();
    }
    void SecondLargest(){
        int [] arr = {1,2,4,5,8,9,7,5,6,7};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            int num = arr[i];

            if(num>largest){
                secondLargest = largest;
                largest = num;
            } else if (num<largest && num>secondLargest) {
                secondLargest = num;
            }
        }
        System.out.println(secondLargest);
    }
}
