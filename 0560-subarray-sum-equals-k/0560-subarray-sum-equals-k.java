class Solution {
    public int subarraySum(int[] nums, int k) {

        int n= nums.length;

        int c=0;

        int[] s=new int[n+1];

        s[0]=0;

        for(int i=1;i<=n;i++)
        {
            s[i]=s[i-1]+nums[i-1];

        }
            for(int j=0;j<s.length;j++)
            {
                for(int p=j+1;p<s.length;p++)
                {
                    if(s[p] - s[j] == k)
                    {
                        c++;
                    }
                }
            }
        
        return c;
        
    }
}