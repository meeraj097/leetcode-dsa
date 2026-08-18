class Solution {
    public int longestConsecutive(int[] nums) {

        int n= nums.length;

        if(n == 0)
        {
            return 0;
        }

        HashSet<Integer> h = new HashSet<>();

        for(int i=0;i<n;i++)
        {
            h.add(nums[i]);
        }

        int longest =0;
        int l =0;
        int c=0;
        for(int i : h)
        {
            if(!h.contains(i-1))
            {
                c= i;
                l=1;

                while(h.contains(c+1))
                {
                    c++;
                    l++;
                }
            }
            longest =  Math.max(longest,l);
        
        }
        return longest;

    }
}