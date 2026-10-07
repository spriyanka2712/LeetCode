class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for(int i = 0; i < row; i++){
            int min = Integer.MAX_VALUE;
            for(int j = 0; j < col; j++){
                min = Math.min(min, matrix[i][j]);
            }
            l1.add(min);
        }
        for(int j = 0; j < col; j++){
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < row; i++){
                max = Math.max(max, matrix[i][j]);
            }
            l2.add(max);
        }
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(matrix[i][j] == l1.get(i) && matrix[i][j] == l2.get(j)){
                    res.add(matrix[i][j]);
                }
            }
        }
        return res;
    
    }
}