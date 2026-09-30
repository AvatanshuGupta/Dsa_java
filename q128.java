// Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

// You must write an algorithm that runs in O(n) time.

 

// Example 1:

// Input: nums = [100,4,200,1,3,2]
// Output: 4
// Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
// Example 2:

// Input: nums = [0,3,7,2,5,8,4,6,0,1]
// Output: 9
// Example 3:

// Input: nums = [1,0,1,2]
// Output: 3

import java.util.HashSet;

public class q128 {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        int seqLen=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        for(Integer x : set){
            if(set.contains(x-1)){
                continue;
            }else{
                int tempSeqLen=1;
                int nextValue=x+1;
                while(set.contains(nextValue)){
                    tempSeqLen++;
                    nextValue++;
                }
                if(tempSeqLen>seqLen){
                    seqLen=tempSeqLen;
                }
            }
        }
        return seqLen;
    }
}
