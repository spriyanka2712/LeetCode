class Solution {
    public int mostFrequent(int[] nums, int key) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == key){
                map.put(nums[i+1], map.getOrDefault(nums[i+1], 0)+1);
            }
        }
        int max = Integer.MIN_VALUE;
        int res = -1;
        for(int keys : map.keySet()){
            if(map.get(keys) > max){
                max = map.get(keys);
                res = keys;
            }
        }
        return res;
    }
}