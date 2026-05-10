import java.util.ArrayList;
public class MergeSort {
    public static void merge(int[] arr,int st,int mid,int end){
        ArrayList<Integer> temp=new ArrayList<Integer>();
        int i=st,j=mid+1;
        while(i<=mid &&j<=end){
            if(arr[i]<arr[j]){
                temp.add(arr[i]);
                i++;
            }
            else{
                temp.add(arr[j]);
                j++;
            }
        }

        while(i<=mid){
            temp.add(arr[i]);
            i++;
        }

        while(j<=end){
            temp.add(arr[j]);
            j++;
        }

        for(int idx=0;idx<temp.size();idx++){
            arr[idx+st]=temp.get(idx);
        }

    }
    public static void mergesort(int arr[],int st,int end){
        if(st<end){
            int mid=st+(end-st)/2;
            mergesort(arr, st, mid); //left
            mergesort(arr, mid+1, end);
            merge(arr, st, mid, end);

        }
    }
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 28, 9, 32, 56};

        // Print array before sorting
        System.out.println("Before Merge sort:");
        for (int num : arr) {   
            System.out.print(num + " ");
        }
        System.out.println();

        // Call merge sort
        mergesort(arr,0,arr.length-1);
        for (int num : arr) {   
            System.out.print(num + " ");
        }
    }
    
}
