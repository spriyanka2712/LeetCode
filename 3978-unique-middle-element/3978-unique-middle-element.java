class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        int mid = nums[nums.length/2];
        if(map.get(mid) == 1){
            return true;
        }
        return false;
    }
}