class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if((nums[i]%2==0 && nums[j]%2==1) || (nums[i]%2==1 && nums[j]%2==0)){
                    count += 1;
                }
            }
            res[i] = count; 
            count = 0;          
        }
        return res;
    }
}