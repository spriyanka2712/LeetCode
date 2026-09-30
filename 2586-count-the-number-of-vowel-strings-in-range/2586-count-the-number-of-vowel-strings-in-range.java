class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        String vowels = "aeiou";
        for(int i = left; i <=right; i++){
            char first = words[i].charAt(0);
            char last = words[i].charAt(words[i].length()-1);
            if(vowels.indexOf(first) != -1 && vowels.indexOf(last) != -1){
                count += 1;
            }
        }
        return count;
    }
}