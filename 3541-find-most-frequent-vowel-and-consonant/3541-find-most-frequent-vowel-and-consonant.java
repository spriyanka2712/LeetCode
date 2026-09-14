class Solution {
    public int maxFreqSum(String s) {
        char ch[] = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            map.put(ch[i], map.getOrDefault(ch[i], 0)+1);
        }
        int maxVowel = 0;
        int maxConsonant = 0;
        for(char key : map.keySet()){
            int frequency = map.get(key);
            if(key == 'a' || key == 'e' || key == 'i' || key == 'o' || key == 'u'){
                maxVowel = Math.max(maxVowel, frequency);
            }
            else{
                maxConsonant = Math.max(maxConsonant, frequency);
            }
        }
        return maxVowel + maxConsonant;
    }
}