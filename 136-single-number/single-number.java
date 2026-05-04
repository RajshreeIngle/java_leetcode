class Solution {
    public int singleNumber(int[] nums) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for(int i : nums){
            ar.add(i);
            
        }
        for(int i : ar){
            if(ar.indexOf(i) == ar.lastIndexOf(i)){
                return i;
            }
        }
        return 0;
    }
}