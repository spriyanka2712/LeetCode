class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(int key : map.keySet()){
            boolean isPrime = true;
            if(map.get(key) <= 1){
                continue;
            }
            for(int i = 2; i*i <= map.get(key); i++){
                if(map.get(key)%i == 0){
                    isPrime = false;
                }
            }
            if(isPrime){
                return true;
            }
        }
        return false;
    }
}