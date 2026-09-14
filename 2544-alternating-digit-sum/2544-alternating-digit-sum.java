class Solution {
    public int alternateDigitSum(int n) {
        int count = 0;
        int sum = 0;
        int temp = n;
        while(temp != 0){
            temp /= 10;
            count += 1;
        }
        while(count > 0){
            int num = n%10;
            if(count % 2 == 0){
                sum -= num;
            }   
            else{
                sum += num;
            }
            n /= 10;
            count--;
            }
        return sum;
    }
}