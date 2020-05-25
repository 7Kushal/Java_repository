import java.util.Arrays;
import java.util.Scanner;

public class Two_pointer_algo {
    public static void main(String[] args){
        System.out.print("Enter the length of array = ");
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        System.out.print("Enter the array elements = ");
        int[] a = new int[l];

        for(int k =0 ; k <l ; k++){
            a[k]=in.nextInt();
        }
        System.out.print("Enter the sum you want to find = ");
        int sum = in.nextInt();
        System.out.println(isEqualTo(a,l,sum));
    }

    public static boolean isEqualTo(int[] arr , int len , int n){
        Arrays.sort(arr);
        int j = len -1;
        int i = 0 ;
        while(i<j){
            if((arr[i]+arr[j])<n)
                i++;
            else if((arr[i]+arr[j])>n)
                j--;
            else
                return true;
        }
        return false;
    }
}
