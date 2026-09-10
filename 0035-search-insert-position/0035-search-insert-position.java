class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int pos = n;
        for(int i = 0; i < n; i++){
            if(nums[i] == target){
                pos = i;
                break;
            }
            else if(nums[i] > target){
                pos = i;
                break;
            }
        }
        return pos;
    }
}