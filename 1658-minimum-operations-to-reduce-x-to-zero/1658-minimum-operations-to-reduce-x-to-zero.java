class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int psum[] = new int[n];
        int rsum[] = new int[n];
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < n; i++){
            sum1 += nums[i];
            sum2 += nums[n-i-1];
            psum[i] = sum1;
            rsum[i] = sum2;
        }
        int res = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(psum[i] == x || rsum[i] == x){
                res = Math.min(res, i+1);
            }
        }
        int i = 0;
        int j = n-1;
        while(i < n && j >= 0){
            if(psum[i]+rsum[j] == x && i+j+2 <= n){
                res = Math.min(res, i+j+2);
                j--;
            }
            else if(psum[i]+rsum[j] > x){
                j--;
            }
            else{
                i++;
            }
        }
        return res == Integer.MAX_VALUE?-1:res;
    }
}