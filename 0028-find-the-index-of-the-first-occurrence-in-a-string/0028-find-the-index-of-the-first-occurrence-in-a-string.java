class Solution {
    public int strStr(String haystack, String needle) {

        int n= haystack.length();
        int m= needle.length();
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(needle.charAt(j)==haystack.charAt(i))
            {
                j++;
            }
            else
            {
                i=i-j;
                j=0;
            }
        if(j==m)
        {
            return i-j+1;
        }
        }
        return -1;
    }
}