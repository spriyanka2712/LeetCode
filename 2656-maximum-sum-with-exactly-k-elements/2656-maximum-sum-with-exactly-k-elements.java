class Solution {
    public int maximizeSum(int[] nums, int k) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int j = 0; j < k; j++){
            for(int i = 0; i < nums.length; i++){
                max = Math.max(max, nums[i]);
            }
            sum += max;
            max += 1;
        }
        return sum;
    }
}