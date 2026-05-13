public class q485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int max=0;
        int counter=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                counter++;
                if(counter>max){
                    max=counter;
                }
            }else{
                counter=0;
            }
        }
        return max;
    }
}
