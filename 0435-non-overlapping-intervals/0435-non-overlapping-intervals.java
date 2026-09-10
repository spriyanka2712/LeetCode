class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count = 0;
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int last = intervals[0][1];
        for(int i = 1; i < intervals.length; i++){
            if(last <= intervals[i][0]){
                last = intervals[i][1];
            }
            else{
                count += 1;
            }
        }
        return count;
    }
}