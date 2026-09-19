class Solution {
    public void generateBrackets(List<String> ans, String s, int open, int close, int n){
        if(s.length() == 2*n){
            ans.add(s);
            return;
        }
        if(open < n){
            generateBrackets(ans, s+'(', open+1, close, n);
        }
        if(close < open){
            generateBrackets(ans, s+')', open, close+1, n);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generateBrackets(ans, "", 0, 0, n);
        return ans;
    }
}