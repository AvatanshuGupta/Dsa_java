public class q1752 {
    public boolean check(int[] nums) {
        int n=nums.length;
        int count=0;
        if(n<3){
            return true;
        }
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                count++;
            }
        }
        if(nums[0]<nums[n-1]){
            count++;
        }
        if(count<2){
            return true;
        }else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        
    }
    
}
