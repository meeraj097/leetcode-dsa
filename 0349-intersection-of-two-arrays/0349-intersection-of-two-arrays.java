class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> h= new HashSet<>();

       
        for(int i=0;i<nums1.length;i++)
        {
            h.add(nums1[i]);
        }

        HashSet<Integer> a = new HashSet<>();

        for(int j=0;j<nums2.length;j++)
        {
            if(h.contains(nums2[j]))
            {
                a.add(nums2[j]);
            }
        }
        int[] res= new int[a.size()];
        int i=0;

        for(int num : a)
        {
            res[i++]=num;
        }

        return res;
    }
}