class Solution {
    public boolean isSameAfterReversals(int num) {
        int n = num;
        int rev = 0;
        int doubleRev = 0;
        while(n > 0){
            rev = (rev*10)+(n%10);
            n /= 10;
        }
        while(rev > 0){
            doubleRev = (doubleRev*10)+(rev%10);
            rev /= 10;
        }
        return num == doubleRev;
    }
}