class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int n= matrix.length;

        int m= matrix[0].length;

        int top =0, bottom =n-1;

        int l=0, r=m-1;

        List<Integer> a= new ArrayList<>();
        
        while(top<=bottom && l<=r){
        for(int i=l;i<=r;i++)
        {
            a.add(matrix[top][i]);
        }
        top++;
        for(int i=top ;i <=bottom;i++)
        {
            a.add(matrix[i][r]);
        }
        r--;
        if(top<= bottom){
        for(int i=r;i>=l;i--)
        {
            a.add(matrix[bottom][i]);

        }
        bottom--;
        }
        if(l<=r){
        for(int i=bottom; i>=top; i--)
        {
            a.add(matrix[i][l]);
        }

        l++;
        }

        }

        return a;
    }
}