class Solution {
    public boolean isSubsequence(String s, String t) {
        int S = s.length();
        int T = t.length();
        int index = 0;
        if(S == 0){
            return true;
        }
        if(S > T){
            return false;
        }
        for(int i = 0; i < T; i++){
            if(s.charAt(index) == t.charAt(i)){
                index++;
            }
            if(index == S){
                return true;
            }
        }
        return S == index;
    }
}