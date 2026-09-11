class Solution {
    public int dominantIndex(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int largestIndex = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > largest){
                largest = nums[i];
                largestIndex = i;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(largest < (2 * nums[i]) && (i != largestIndex)){
                return -1;
            }
        }
        return largestIndex;
    }
}