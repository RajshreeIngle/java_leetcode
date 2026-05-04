class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> expected = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(!expected.contains(nums[i])){
                expected.add(nums[i]);
            }
        }
        Arrays.fill(nums, 0);
        int index =0;
        for(int i : expected){
            nums[index] = i;
            index++;
        }
        return expected.size();
    }
}