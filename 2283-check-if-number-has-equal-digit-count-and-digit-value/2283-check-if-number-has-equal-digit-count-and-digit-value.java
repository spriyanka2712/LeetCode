class Solution {
    public boolean digitCount(String num) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < num.length(); i++){
            int n = num.charAt(i)-'0';
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        for(int i = 0; i < num.length(); i++){
            if(num.charAt(i)-'0' != map.getOrDefault(i, 0)){
                return false;
            }
        }
        return true;
    }
}