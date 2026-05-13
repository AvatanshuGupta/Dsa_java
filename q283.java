public class q283{
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int j=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(count==0){
            if(nums[i]==0){
                j=i;
                count++;
            }
            }
            if(nums[i]!=0){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                j++;

            }
        }
    }
}