class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n+1];
        int d=0,m=0;
        
        for(int num:nums)
        {
          ans[num]++;
        }
        for (int i = 1; i <= n; i++) {
            if (ans[i] == 2) d = i;
            if (ans[i] == 0) m = i;
        }
        return new int[]{d,m};
    }
}