class Solution {
    public char repeatedCharacter(String s) {
        char ch[] = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            if(stack.contains(c)){
                sb.append(c);
                break;
            }
            stack.push(c);
        }
        return sb.charAt(0);
    }
}