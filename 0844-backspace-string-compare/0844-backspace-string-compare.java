class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        char ch1[] = s.toCharArray();
        char ch2[] = t.toCharArray();
        for(int i = 0; i < ch1.length; i++){
            if(!st1.isEmpty() && ch1[i] == '#'){
                st1.pop();
            }
            else if(ch1[i] != '#'){
                st1.push(ch1[i]);
            }
        }
        for(int i = 0; i < ch2.length; i++){
            if(!st2.isEmpty() && ch2[i] == '#'){
                st2.pop();
            }
            else if(ch2[i] != '#'){
                st2.push(ch2[i]);
            }
        }
        return st1.equals(st2);
    }
}