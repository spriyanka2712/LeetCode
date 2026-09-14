class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        for(int i = min+1; i < max; i++){
            boolean found = false;
            for(int j = 0; j < nums.length; j++){
                if(nums[j] == i){
                    found = true;
                    break;
                }

            }
            if(!found){
                res.add(i);
            }
        }
        return res;
    }
}