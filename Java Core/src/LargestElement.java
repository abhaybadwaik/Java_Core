import java.util.*;
public class LargestElement {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[]arr=new int[n];

        System.out.println(n);

        arr[0]=sc.nextInt();
        int max = arr[0];

        for(int i=1; i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]> max){
                max=arr[i];

            }
        }
        System.out.println("largest Element is" + max);
    }
}
