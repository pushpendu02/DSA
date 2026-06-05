class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //             if(nums[i]+nums[j]==target){
        //             return new int[] { i, j };
        //         }
        //     }
        // }
        // // If no valid pair is found, return an empty array instead of null
        // return new int[] {};
        Map<Integer,Integer>pairIdx=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int fir=nums[i];
            int sec=target-fir;
            if(pairIdx.containsKey(sec)){
                return new int[]{i,pairIdx.get(sec)};
            }
            pairIdx.put(fir,i);
            
        }
        return new int[]{};
        
    }
}
