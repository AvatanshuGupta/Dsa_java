public class BubbleSort {

    public static void bubblesort(int arr[]){
        int n=arr.length;
        for(int i=n;i>0;i--){
            for(int j=0;j<i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 28, 9, 32, 56};

        // Print array before sorting
        System.out.println("Before bubble sort:");
        for (int num : arr) {   
            System.out.print(num + " ");
        }
        System.out.println();

        // Call bubble sort
        bubblesort(arr);
        for (int num : arr) {   
            System.out.print(num + " ");
        }
        
    }
    
}
