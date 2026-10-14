class Solution {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            int sum = nums[i];
            for(int j = i; j < n-1; j++){
                if(nums[j] < nums[j+1]){
                    sum += nums[j+1];
                }
                else{
                    break;
                }
            }
            maxsum = Math.max(maxsum, sum);
        }
        return maxsum;
    }
}