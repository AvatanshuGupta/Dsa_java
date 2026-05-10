public class PlusOne {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]+=1;
                return digits;

            }
            digits[i]=0;
        }
        int new_ar[]=new int[n+1];
        new_ar[0]=1;
        return new_ar;
        }
        public static void main(String[] args) {
            
        }
}
