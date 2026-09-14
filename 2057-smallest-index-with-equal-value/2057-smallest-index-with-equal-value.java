class Solution {
    public int smallestEqual(int[] nums) {
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if((i%10 == nums[i]) && (i < smallest)){
                smallest = i;
            }
        }
        return smallest == Integer.MAX_VALUE ? -1:smallest;
    }
}