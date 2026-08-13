class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;


        int min = prices[0];
        int maxp = 0;
        
        for(int i=1;i<n;i++)
        {
            if(prices[i]< min)
            {

                min= Math.min(min, prices[i]);

            }

           

            else
            {
                int cp = prices[i] - min;

                maxp = Math.max(maxp, cp);
            }



        }
        return maxp;


    }

}




/*


        int max= prices[inx-1];

        for( int j=inx-1;j<n;j++)
        {
            if(prices[j]>max)
            {
                max=Math.max(max, prices[j]);
            }
        }
        
        return max-min;


*/