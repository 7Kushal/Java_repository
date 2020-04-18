import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i = 0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int j =0;
        for(int i = 0;i<n-1;i++){
            boolean sorted = true;
            while(j<n-1-i)
            {if(array[j]>array[j+1]){
                int temp = array[j];
                array[j]=array[j+1];
                array[j+1]=temp;
                sorted = false;
            }
                j++;
            }
            j=0;
            if(sorted) break;
        }
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
}
/*output
        5
        9
        1
        0
        3
       sorted -> 0 1 3 5 9
*/