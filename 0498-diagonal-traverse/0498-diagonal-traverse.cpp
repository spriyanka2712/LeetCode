class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        map<int , vector<int>> mp;
        vector<int> result;
        int m = mat.size();
        int n = mat[0].size();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                mp[i+j].push_back(mat[i][j]);
            }
        }
        bool flip = true;
        for(auto &item : mp){
            if(flip){
                reverse(item.second.begin(), item.second.end());
            }
            for(int &nums : item.second){
                result.push_back(nums);
            }
            flip = !flip;
        }
        return result;
    }
};