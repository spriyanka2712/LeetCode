class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int row = image.length;
        int col = image[0].length;
        for(int i = 0; i < row; i++){
            col = image[0].length;
            for(int j = 0; j < col; j++){
                int temp = 1 - image[i][j];
                image[i][j] = 1 - image[i][col-1];
                image[i][col-1] = temp;
                col--;
            }
        }
        return image;
    }
}