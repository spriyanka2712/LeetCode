class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int sol[][] = new int[m][2];
        for(int i = 0; i < m; i++){
            int sum = 0;
            for(int j = 0; j < n; j++){
                sum += mat[i][j];
            }
            sol[i][0] = i;
            sol[i][1] = sum;
        }
        Arrays.sort(sol, (a,b) -> a[1]-b[1]);
        int res[] = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = sol[i][0];
        }
        return res;
    }
}