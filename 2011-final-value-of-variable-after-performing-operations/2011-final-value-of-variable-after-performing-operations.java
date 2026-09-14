class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;
        int n = operations.length;
        for(int i = 0; i < n; i++){
            if (operations[i].charAt(1) == '+')
                X += 1;
            else
                X -= 1;
        }
        return X;
    }
}