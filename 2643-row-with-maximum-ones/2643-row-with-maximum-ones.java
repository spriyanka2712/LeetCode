class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        int res = 0;
        int index = 0;
        for(int i = 0; i < r; i++){
            int count = 0;
            for(int j = 0; j < c; j++){
                if(mat[i][j] == 1){
                    count += 1;
                }
            }
            if(count > res){
                res = count;
                index = i;
            }
        }
        return new int[]{index, res};
    }
}