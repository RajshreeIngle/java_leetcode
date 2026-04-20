class Solution {
    public int reverse(int x) {
        int reversed =0, rem =0;
        while(x!=0){
            rem = x%10;
            x/=10;
            
            if(reversed > Integer.MAX_VALUE/10 || reversed == Integer.MAX_VALUE/10 && rem>7){
                return 0;
            }
            if(reversed < Integer.MIN_VALUE/10 || reversed == Integer.MIN_VALUE/10 && rem<-8){
                return 0;
            }
            reversed = (reversed *10)+ rem;
            
        }
        // if((reversed >= Integer.MAX_VALUE/10 && reversed%10 >7) ||( reversed <= Integer.MIN_VALUE/10 && reversed%10<-8)){
        //     return 0;
        // }
        return reversed;
    }
}