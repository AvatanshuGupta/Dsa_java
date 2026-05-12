public class q26 {
    public int removeDuplicates(int[] nums) {
        int p1=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[p1]){
                nums[p1+1]=nums[i];
                p1++;
            }
        }
        return p1+1;
        
    }
}
