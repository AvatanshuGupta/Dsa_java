public class SelectionSort {
    public static void selectionsort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }      
            }
            int temp=arr[i];
                    arr[i]=arr[min];
                    arr[min]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 28, 9, 32, 56};

        // Print array before sorting
        System.out.println("Before selection sort:");
        for (int num : arr) {   
            System.out.print(num + " ");
        }
        System.out.println();

        // Call selection sort
        selectionsort(arr);
        for (int num : arr) {   
            System.out.print(num + " ");
        }
    
        
    }
}
