public class InsertionSort {
    public static void insertionsort(int[] ar){
        int n=ar.length;
        for(int i=1;i<n-1;i++){
            int curr=ar[i];
            int prev=i-1;
            while(prev>=0 && ar[prev]>curr){
                ar[prev+1]=ar[prev];
                prev--;
            }
            ar[prev+1]=curr;
        }

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
        insertionsort(arr);
        for (int num : arr) {   
            System.out.print(num + " ");
        }
        
    }
}
