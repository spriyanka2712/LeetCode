class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        char ch[] = s.toCharArray();
        for(int i = 0; i < s.length()-1; i++){
            score += Math.abs((int)ch[i] - (int)ch[i+1]);
        }
        return score;
    }
}