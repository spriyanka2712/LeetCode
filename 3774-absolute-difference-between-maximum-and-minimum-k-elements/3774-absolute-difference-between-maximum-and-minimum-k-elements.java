class Solution {
    public int absDifference(int[] nums, int k) {
        int n = nums.length;
        int kLargest = 0;
        int kSmallest = 0;
        Arrays.sort(nums);
        for(int i = 0; i < k; i++){
            kSmallest += nums[i];
            kLargest += nums[n-i-1];

        }
        return Math.abs(kLargest - kSmallest);
    }
}