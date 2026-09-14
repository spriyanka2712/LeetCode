class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        int count = 0;
        int maximum = 0;
        for(int key : map.keySet()){
            if(map.get(key) == maximum){
                count += 1;
            }
            if(map.get(key) > maximum){
                maximum = map.get(key);
                count = 1;
            }
        }
        return count*maximum;
    }
}