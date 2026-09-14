class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = heights.length;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if(heights[i] < heights[j]){
                    String str = names[i];
                    names[i] = names[j];
                    names[j] = str;
                    int num = heights[i];
                    heights[i] = heights[j];
                    heights[j] = num;
                }
            }
        }
        return names;
    }
}