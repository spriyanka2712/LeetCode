class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            int right = 0;
            int left = 0;
            for(int j = i; j < s.length(); j++){
                if(s.charAt(j) == 'R'){
                    right += 1;
                }
                else{
                    left += 1;
                }
            }
            if(right == left){
                count += 1;
            }
        }
        return count;
    }
}