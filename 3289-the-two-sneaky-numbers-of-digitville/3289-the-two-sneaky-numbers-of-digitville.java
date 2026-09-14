class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length;
        int res[] = new int[2];
        int index = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
            if(map.get(num) == 2){
                res[index] = num;
                index += 1;
                if(index == 2){
                    break;
                }
            }
        }

        return res;
    }
}