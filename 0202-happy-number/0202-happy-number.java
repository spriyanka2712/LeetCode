class Solution {
    public boolean isHappy(int n) {
        int sum = 0;
        if(n == 1){
            sum = 1;
        }
        else{
        while(n >= 7){
            sum = 0;
            while(n > 0){
                sum += (n%10)*(n%10);
                n /= 10;
            }
            n = sum;
        }
    }
        return sum == 1;
    }
}