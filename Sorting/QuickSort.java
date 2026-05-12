public class QuickSort{
    public static int partition(int[] arr, int st, int end){
        int idx=st-1;
        int piv=arr[end];
        for(int i=st;i<end;i++){
            if(arr[i]<=piv){
                idx++;
                int temp=arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
            }
        }
        idx++;
        int temp=arr[end];
        arr[end]=arr[idx];
        arr[idx]=temp;
        return idx;
        
    }
    public static void quicksort(int[] arr , int st, int end){
        if(st<end){
            int pivIdx=partition(arr,st,end);
            quicksort(arr, st, pivIdx-1); //left
            quicksort(arr, pivIdx+1, end); //right

        }
    }
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 28, 9, 32, 56};

        // Print array before sorting
        System.out.println("Before Quick sort:");
        for (int num : arr) {   
            System.out.print(num + " ");
        }
        System.out.println();

        // Call quick sort
        quicksort(arr,0,arr.length-1);
        for (int num : arr) {   
            System.out.print(num + " ");
        }
    }
}