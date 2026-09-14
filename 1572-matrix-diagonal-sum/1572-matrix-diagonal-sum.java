class Solution {
    public int diagonalSum(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int sum = 0;
        for(int i = 0; i < row;i++){
            sum += mat[i][i] + mat[i][col - i - 1];
            }
        if(row % 2 == 1){
            sum -= mat[row/2][col/2];
        }
        return sum;
    }
}