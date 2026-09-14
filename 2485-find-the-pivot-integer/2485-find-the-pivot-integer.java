class Solution {
    public int pivotInteger(int n) {
        if(n==1){
            return n;
        }
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 1; i <= n; i++){
            sum1 += i;
        }
        for(int i = n; i > 0; i--){
            if((sum1-sum2) == sum2 + i){
                return i;
            }
            sum2 += i;
        
        }
        return -1;
    }
}