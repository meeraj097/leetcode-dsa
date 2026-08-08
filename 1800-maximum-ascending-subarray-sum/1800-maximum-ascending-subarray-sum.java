class Solution {
    public int maxAscendingSum(int[] nums) {

        int n= nums.length;

        int k=0;

        int max= nums[0];

        int s=nums[0];
        for(int i=1;i<n;i++)
        {
            if(nums[i-1]<nums[i])
            {
                s=s+nums[i];

                max= Math.max(max,s);
            }
            else
            {
                s=nums[i];
            }
        }
        return max;
        
    }
}