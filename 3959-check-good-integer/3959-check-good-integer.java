class Solution {
    public boolean checkGoodInteger(int n) {
        int digSum = 0;
        int sqSum = 0;
        while(n > 0){
            digSum += n%10;
            sqSum += (n%10)*(n%10);
            n /= 10;
        }
        return sqSum-digSum >= 50;
    }
}