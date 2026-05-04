class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i =0; i< nums.length ; i++){
            if(nums[i] != val){
                al.add(nums[i]);
            }
        }
        int index = 0;
        for(int i : al){
            nums[index] = i;
            index++;
        }
        return al.size();
    }
}