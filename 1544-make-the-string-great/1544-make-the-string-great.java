class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        char ch[] = s.toCharArray();
        for(int i = 0; i < ch.length; i++){
            if(!st.isEmpty() && Character.toLowerCase(ch[i]) == Character.toLowerCase(st.peek()) && (ch[i] != st.peek())){
                st.pop();
            }
            else{
                st.push(ch[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c : st){
            sb.append(c);
        }
        return sb.toString();
    }
}