class Solution {
    public int pivotIndex(int[] nums) {
        
        int pivot =0;
        int n = nums.length;
        while(n!=0){
            int leftSum=0;
            int rightSum=0;
            for(int j=pivot-1 ; j>=0;j--){
                leftSum+=nums[j];
            }
            for(int i =pivot; i<nums.length-1; i++){
                rightSum+=nums[i+1];
            }
            if(leftSum == rightSum){
                return pivot;
            }
            pivot++;
            n--;
        }
        return -1;
        
        
    }
}