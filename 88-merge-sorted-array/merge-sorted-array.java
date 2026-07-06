class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1.length == 1 && nums2.length == 0){
            return;
        }
        int j=0;
        for(int i=m; i<m+n; i++){
           nums1[i]=nums2[j];
           j++;
        }
        
        for(int i = 0; i<m+n ;i++){
            for(int k=0; k<m+n-i-1 ; k++){
                if(nums1[k]>nums1[k+1]){
                    int temp= nums1[k];
                    nums1[k] = nums1[k+1];
                    nums1[k+1] = temp;
                }
            }
        }
        return;
    }
}