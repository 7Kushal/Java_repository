import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        
        int[] req = {4 ,1, 3, 9, 7};
        mergesort(req, 0, 4);
        System.out.println(Arrays.toString(req));
    }


    // we need two methods one is mergesort itself other is a merger function

    public static void mergesort(int[] arr, int start, int end){
        // System.out.println(Arrays.toString(arr) + " here " + start + " " + end);
        if(start>=end)
        return;
        int mid = (end-start)/2+start;
        mergesort(arr, start, mid);
        mergesort(arr, mid+1, end);
        merger(arr,start,mid,end);
    }

    public static void merger(int[] arr, int start, int mid, int end){
        // its work is to merge two sorted arr's 
        int[] temp = new int[end-start+1];
        // System.out.println(Arrays.toString(arr)+ " there " + start +" " + mid + " " + end);
        int itemp = 0;
        int j = mid + 1;
        int iarr = start;
        while(iarr<=mid && j <=end){
            if(arr[iarr]>arr[j]){
                temp[itemp++] = arr[j++]; 
            }
                temp[itemp++] = arr[iarr++];
        }    

        while(iarr<=mid){
            temp[itemp++]=arr[iarr++];
        }
        while(j<=end){
            temp[itemp++]=arr[j++];
        }
        int in = 0;
        for(int k=start; k<=end;k++){
            arr[k]=temp[in++];
        }
    }
}
