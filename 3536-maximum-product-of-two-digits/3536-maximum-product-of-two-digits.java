class Solution {
    public int maxProduct(int n) {
        int temp = n;
        int length = String.valueOf(n).length();
        int[] digits = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        int max = 0;
        for(int i = 0; i < length-1; i++){
            for(int j = i+1; j < length; j++){
                max = Math.max(max, digits[i]*digits[j]);
            }
        }
        return max;
    }
}