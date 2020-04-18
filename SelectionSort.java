import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements in the array : ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("enter elements of the array : ");
        for(int i = 0 ; i<n ; i++) {
            array[i] = sc.nextInt();
        }
//here we did selection sorting
        //swap is done only when there is an minimum element as compared to ith no
        //during iterations
        //so this makes selection sort more efficient then bubble sort
        //bubble sort need more time as it completes all swapping .

        for(int i = 0;i<n-1;i++){
            int temp = array[i];//used if there is already minimum element at ith position
            int k =i;//minimum index used here will updated whenever minimum value is found as compared to temp
            for(int j = i+1;j<n;j++){
                if(array[j]<temp) {
                    temp = array[j];
                    k = j;
                }
            }
            array[k]=array[i];
            array[i]=temp;
            ;
        }
        for (int item:array
             ) {
            System.out.print(item+"  ");

        }
    }
}
/*
output
5
9
1
0
3
0 1 3 5 9
 */
