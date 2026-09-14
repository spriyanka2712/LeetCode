class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int max = 0;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if((colors[i] != colors[j]) && (Math.abs(i-j) > max)){
                    max = Math.abs(i-j);
                }
            }
        }
        return max;
    }
}