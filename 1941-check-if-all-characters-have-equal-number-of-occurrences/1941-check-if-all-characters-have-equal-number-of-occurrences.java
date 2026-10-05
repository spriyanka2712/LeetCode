class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        int n = map.values().iterator().next();
        for(char key : map.keySet()){
            if(map.get(key) != n){
                return false;
            }
        }
        return true;
    }
}