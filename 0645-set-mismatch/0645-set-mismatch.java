class Solution {
    public int[] findErrorNums(int[] nums) {
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
            sum += i;
        }
        int res[] = new int[2];
        for(int key : map.keySet()){
            if(map.get(key) == 2){
                res[0] = key;
            }
        }
        sum -= res[0];
        int n = nums.length+1;
        res[1] = (n*(n-1)/2)-sum;
        return res;
    }
}