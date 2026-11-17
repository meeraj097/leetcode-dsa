class Solution {
    public int searchInsert(int[] nums, int target) {

        int n = nums.length, k=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i] == target)
            {
                k =i;
            }
            else
            {
                if(nums[i]<=target)
                {
                    k++;
                }
            }
        }
        
        return k;
    }
}