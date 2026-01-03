class Solution {
    //prathima
    public int findMaxConsecutiveOnes(int[] nums) {
    int count =0;
    int n=nums.length;
    int max=0;
    for(int i=0;i<n;i++)
    {
        if(nums[i]==1)
        {
            count++;
            max=Math.max(max,count);
        }
        else
        {
            count =0;
        }
    }
    return max;
    }
    
}