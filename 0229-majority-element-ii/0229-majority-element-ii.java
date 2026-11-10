class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int n= nums.length;

        HashMap<Integer, Integer> h = new HashMap<>();

        for(int i=0;i<n;i++)
        {
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> a = new ArrayList<>();

        for(int i:h.keySet())
        {
            if(h.get(i)>n/3)
            {
                a.add(i);
            }
        }
        return a;
    }
}