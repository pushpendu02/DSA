class Solution {
    public int maxProduct(int[] nums) {
        int maxprod=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
                int curprod=1;
            for(int j=i;j<nums.length;j++){
                    curprod=curprod*nums[j];
                    maxprod=Math.max(maxprod,curprod);
            }
        }
        return maxprod;
    }
}