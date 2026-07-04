class Solution {
    public int mySqrt(int x) {
        if(x==1 || x==0){
            return x;
        }

        long start = 1;
        long end = x;
        long mid =0;

        while(start<=end){
            mid = start + (end-start)/2;
            if(mid*mid > (long)x){
                end = mid-1;
            }else if(mid*mid==x){
                return (int)mid;
            }else{
                start=mid+1;
            }
        }
        return Math.round(end);
    }
}