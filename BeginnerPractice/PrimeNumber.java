package BeginnerPractice;

public class PrimeNumber {
    public static void main(String[] args) {
    PrimeNumber obj = new PrimeNumber();
            obj.primo(9);
    }
    void primo(int num){
        int count = 0;

        if(num<=1){
            System.out.println("Not a prime number");
        }else{
            for (int i=2; i<=num/2; i++){
                if(num % i == 0){
                    count ++;
                    break;
                }
            }
        }
        if(count>0){
            System.out.println("it is not a prime number");
        }else {
            System.out.println("PRIME HAI");
        }
    }
}
