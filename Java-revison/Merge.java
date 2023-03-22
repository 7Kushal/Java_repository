public class Merge {
    public static void main(String[] args) {
        int arr[] ={4,3,77,21,76,22};
        MergeSort(arr, 0,5);
        System.out.println("Kushal");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void merge(int[] arr, int l,int mid,int h){
        int[] temp = new int[h-l+1];
        int x =0;
        int x1 = l;
        int x2 = mid+1;
        while(x1<=mid && x2<=h){
            if(arr[x1]<=arr[x2])
            temp[x++] = arr[x1++];
            else
            temp[x++] = arr[x2++];
        }
        while(x1<=mid){
            temp[x++] = arr[x1++];
        }
        while(x2<=h){
            temp[x++] = arr[x2++];
        }
        for(int i =0,j=l;i<temp.length;i++,j++)
        arr[j]=temp[i];
    }
    public static void MergeSort(int[] arr, int l, int h ) {
        if(l>=h){
            return;
        }
        else{
            int mid = l +(h-l)/2;
            MergeSort(arr,l,mid);
            MergeSort(arr,mid+1,h);
            merge(arr, l, mid, h);
        }
    }
}
