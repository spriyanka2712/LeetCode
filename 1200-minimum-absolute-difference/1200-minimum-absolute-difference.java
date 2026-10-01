class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i = 0; i < n-1; i++){
            if(arr[i+1] - arr[i] <= min){
                if(arr[i+1]-arr[i] < min){
                    res.clear();
                }
                min = arr[i+1]-arr[i];
                res.add(new ArrayList<>(Arrays.asList(arr[i], arr[i+1])));
            }
        }
        return res;
    }
}