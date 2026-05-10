public class RecursiveInsertionSort {
    public static void recInsertionSort(int[] arr , int n){
        if(n==1){
            return ;
        }
        recInsertionSort(arr, n-1);
        int curr=arr[n-1];
        int prev=n-2;

        while(prev>=0 && arr[prev]>curr){
            arr[prev+1]=arr[prev];
            prev--;
        }
        arr[prev+1]=curr;
        
        }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 28, 9, 32, 56};

        // Print array before sorting
        System.out.println("Before Insertion sort:");
        for (int num : arr) {   
            System.out.print(num + " ");
        }
        System.out.println();

        // Call insertion sort
        recInsertionSort(arr, arr.length);
        for (int num : arr) {   
            System.out.print(num + " ");
        }
        
    }
}
    
