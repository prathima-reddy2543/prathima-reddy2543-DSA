class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int m=0;
        for(int i=0;i<k;i++)
        {
            m+=nums[i];
        }
        int w=m;
        for(int i=k;i<n;i++)
        {
            w+=nums[i]-nums[i-k];
            m=Math.max(w,m);
        }
        return (double) m/k;
    }
}