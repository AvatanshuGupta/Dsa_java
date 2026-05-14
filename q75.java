public class q75 {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int j=0;
        int k=n-1;
        if(n==1){
            return;
        }
        for(int i=0;i<k+1;i++){
            if(nums[i]==0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
            if(nums[i]==2){
                int temp=nums[i];
                nums[i]=nums[k];
                nums[k]=temp;
                k--;
                i--;
            }
        }
    }
}