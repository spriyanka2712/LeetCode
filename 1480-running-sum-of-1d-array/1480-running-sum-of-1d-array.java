class Solution {
    public int[] runningSum(int[] nums) {
        int length = nums.length;
        int sum = 0;
        int arr[] = new int[length];
        for(int i = 0; i < length; i++){
            sum += nums[i];
            arr[i] = sum;
        }
        return arr;
    }
}