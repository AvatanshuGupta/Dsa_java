// Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

// A subarray is a contiguous non-empty sequence of elements within an array.

 

// Example 1:

// Input: nums = [1,1,1], k = 2
// Output: 2
// Example 2:

// Input: nums = [1,2,3], k = 3
// Output: 2
 

// Constraints:

// 1 <= nums.length <= 2 * 104
// -1000 <= nums[i] <= 1000
// -107 <= k <= 107



import java.util.HashMap;

public class q560 {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum==k){
                count++;
            }
            
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }

            if(!map.containsKey(sum)){
                map.put(sum,1);
            }else{
                map.put(sum,map.get(sum)+1);
            }
            
        }
        return count;
    }
}
