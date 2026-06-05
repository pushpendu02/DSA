class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
      HashSet<Integer>set=new HashSet<>();
      int a=-1;int b=-1;
      int actsum=0;
      int n=grid.length;
      int expsum=(n*n)*(n*n +1)/2;
      
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            actsum+=grid[i][j];
            if(set.contains(grid[i][j])){
                a=grid[i][j];
            }else{
                set.add(grid[i][j]);
            }

        }
      }
      b=(expsum+a)-actsum;
      return new int[]{a,b};
    }
}