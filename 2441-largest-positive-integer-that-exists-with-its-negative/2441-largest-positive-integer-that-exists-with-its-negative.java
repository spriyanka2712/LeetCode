class Solution {
    public int findMaxK(int[] nums) {
        int n = nums.length;
        int max = -1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(nums[i] == -nums[j]){
                    max = Math.max(max, Math.abs(nums[i]));
                }
            }
        }
        return max;
    }
}