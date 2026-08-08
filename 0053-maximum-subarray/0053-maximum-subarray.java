class Solution {
    public int maxSubArray(int[] nums) {

        int n= nums.length;
        int s=0;
        int max = Integer.MIN_VALUE;    
        
            for(int j=0;j<n;j++)
            {
                s=s+nums[j];

                max= Math.max(max,s);
                
                if(s<0)
                {
                    s=0;
                }

               
            }
            


        return max;
        
    }
}