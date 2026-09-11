class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int res[] = new int[n+1];
        int I = 0; 
        int D = n;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == 'I'){
                res[i] = I;
                I++;
            }
            else{
                res[i] = D;
                D--;
            }
        }
        res[n] = I;
        return res;
    }
}