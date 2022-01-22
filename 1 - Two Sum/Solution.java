class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mapResult = new HashMap<>();
        
        for(int i=0; i < nums.length; i++){
            int pairNumber = target - nums[i];
            
            if(mapResult.containsKey(pairNumber)){
                return new int[]{mapResult.get(pairNumber),i};
            } 
             mapResult.put(nums[i],i);
        }
        return new int[]{};
    }
}
