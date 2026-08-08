class Solution {
    public int majorityElement(int[] nums) {

        int n= nums.length;

        HashMap<Integer, Integer> h= new HashMap<>();

        for(int i=0;i<n;i++)
        {
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }

        int max = nums[0];

        for(int key : h.keySet())
        {
            if(h.get(key) > n/2)
            {
                max = key;
                break;
            }
        }

        return max;
        

        
    }
}