public class RecursiveBubbleSort {
    public static void recBubbleSort(int[] arr, int n){
        if(n==1){
            return ;
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        recBubbleSort(arr, n-1);
    }
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 28, 9, 32, 56};

        System.out.println("Before sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        recBubbleSort(arr, arr.length);

        System.out.println("After sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
    }
}
