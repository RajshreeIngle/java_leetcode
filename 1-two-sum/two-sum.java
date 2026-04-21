class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> num_index= new HashMap<>();
        int compliment;
        for(int i =0; i<nums.length; i++){
            compliment = target - nums[i];
            if(num_index.containsKey(compliment)){
                return new int[]{num_index.get(compliment),i};
            }
            num_index.put(nums[i],i);     
        }
        return new int[]{};   
    }
}