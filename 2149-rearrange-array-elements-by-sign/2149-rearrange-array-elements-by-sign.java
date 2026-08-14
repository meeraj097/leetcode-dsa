class Solution {
    public int[] rearrangeArray(int[] nums) {


        int n= nums.length;

        int[] pos = new int[n/2];

        int[] neg =new int[n/2];
        int p=0, ne=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>=0)
            {
                pos[p++] = nums[i];
            }

            else
            {
                neg[ne++] = nums[i];
            }

        }
        int k =0, l=0;
        for(int i=0;i<n;i++)
        {
            if(i%2 ==0)
            {
                nums[i] = pos[k++];
            }

            else{

                nums[i] = neg[l++];
            }
        }

        return nums;
        
    }
}