package sorting;

public class Quicksort {
    static int[] arr ={9,5,7,12,6,80,28,16};
    public static void quicksort(int[] arr, int lo, int hi){
        if(lo<hi){
            int p = partition(arr,lo,hi);
            quicksort(arr,lo,p-1);
            quicksort(arr,p+1,hi);
        }
    }
    public static int partition(int[] arr, int lo, int hi){
        int pivot = arr[lo];
        int i = lo+1;
        for(int j=i;j<=hi;j++){
            if(arr[j]<pivot){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
                i++;
            }
        }
        int temp1 = arr[i-1];
        arr[i-1]= arr[lo];
        arr[lo]= temp1;
        return i-1;
    }

    public static void main(String[] args) {

        quicksort(arr,0,arr.length-1);
        for(int i =0; i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }

}
