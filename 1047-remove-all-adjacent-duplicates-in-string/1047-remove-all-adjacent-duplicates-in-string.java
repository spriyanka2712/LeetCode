class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        char ch[] = s.toCharArray();
        for(int i = 0; i < s.length(); i++){
            if((!stack.isEmpty()) && (ch[i] == stack.peek())){
                stack.pop();
            }
            else{
                stack.push(ch[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c : stack){
            sb.append(c);
        }
        return sb.toString(); 
    }
}