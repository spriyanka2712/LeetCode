class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int maxMoney[] = new int[n+1];
        maxMoney[n] = 0;
        maxMoney[n-1] = nums[n-1];
        for(int i = n-2; i >= 0; i--){
            maxMoney[i] = Math.max(nums[i]+maxMoney[i+2], maxMoney[i+1]);
        }
        return maxMoney[0];
    }
}