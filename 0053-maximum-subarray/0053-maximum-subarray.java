class Solution {
    public int maxSubArray(int[] nums) {
        // int maxsum=Integer.MIN_VALUE;
        // for(int st=0;st<nums.length;st++){
        //     int cursum=0;
        //     for(int end=st;end<nums.length;end++){//This is bruteforce method
        //         cursum=cursum+nums[end];
        //         maxsum=Math.max(maxsum,cursum);
        //     }
        // }
        // return maxsum;
        int cursum=0,maxsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            cursum=cursum+nums[i];
            maxsum=Math.max(maxsum,cursum);//kadan's algo-when the sum is neg then it set again 0 because neg number never give the max sum
            if(cursum<0){
                cursum=0;
            }
        }
        return maxsum;
    }
}