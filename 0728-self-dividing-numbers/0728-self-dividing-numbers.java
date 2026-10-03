class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for(int i = left; i <= right; i++){
            int temp = i;
            boolean flag = true;
            while(temp > 0){
                int j = temp%10;
                temp /= 10;
                if(j == 0 || i%j != 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                res.add(i);
            }
        }
        return res;
    }
}