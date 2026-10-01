// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

 

// Example 1:

// Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]
// Explanation:
// rotate 1 steps to the right: [7,1,2,3,4,5,6]
// rotate 2 steps to the right: [6,7,1,2,3,4,5]
// rotate 3 steps to the right: [5,6,7,1,2,3,4]
// Example 2:

// Input: nums = [-1,-100,3,99], k = 2
// Output: [3,99,-1,-100]
// Explanation: 
// rotate 1 steps to the right: [99,-1,-100,3]
// rotate 2 steps to the right: [3,99,-1,-100]


public class q189 {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if(k>n){
            k=k%n;
        }
        for(int i=0;i<(n-k)/2;i++){
            int temp=nums[i];
            nums[i]=nums[n-k-1-i];
            nums[n-k-1-i]=temp;
        }
        int j=0;
        for(int i=n-k;i<(n-k/2);i++){
            int temp=nums[i];
            nums[i]=nums[n-1-j];
            nums[n-1-j]=temp;
            j++;
        }
        for(int i=0;i<(n/2);i++){
            int temp=nums[i];
            nums[i]=nums[n-1-i];
            nums[n-1-i]=temp;
        }

    }
}
