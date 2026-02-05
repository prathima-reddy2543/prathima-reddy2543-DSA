class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int write=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=0)
            nums[write++]=nums[i];
        }
        while(write<n)
        {
            nums[write++]=0;
        }
    }
}