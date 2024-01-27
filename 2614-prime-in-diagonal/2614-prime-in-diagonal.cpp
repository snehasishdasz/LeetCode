class Solution {
public:
    bool isPrime(int x) {
        if (x <= 1) return false;
        for (int a = 2; a <= sqrt(x); a++) 
            if (x % a == 0) 
                return false;
        return true;
    }
    int diagonalPrime(vector<vector<int>>& nums) {
        int ans=0;
        for(int a=0;a<nums.size();a++)
            for(int j=0;j<nums[0].size();j++)
                if((a==j||j==nums.size()-a-1)&&isPrime(nums[a][j]))ans=max(nums[a][j],ans);
        return ans;
    }
};
