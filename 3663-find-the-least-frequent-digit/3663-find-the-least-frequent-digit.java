class Solution {
    public int getLeastFrequentDigit(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        while(n > 0){
            map.put(n%10, map.getOrDefault(n%10, 0)+1);
            n /= 10;
        }
        int min = Integer.MAX_VALUE;
        int res = -1; 
        for(int key : map.keySet()){
            if(map.get(key) < min){
                min = map.get(key);
                res = key;
            }
        }
        return res;
    }
}