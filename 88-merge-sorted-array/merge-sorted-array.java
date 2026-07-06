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
        
       Arrays.sort(nums1);
       return;
    }
}