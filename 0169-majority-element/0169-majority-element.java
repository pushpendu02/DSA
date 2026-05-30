class Solution {
    public int majorityElement(int[] nums) {
        int major=nums[0],count=1;
        for(int i=1;i<nums.length;i++){
            if(count==0){
                count++;
                major=nums[i];
            }else if(major==nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return major;
        // int freq=0,ans=0;
        // for(int i=0;i<nums.length;i++){//Moore's voting algo
        //     if(freq==0){
        //         ans=nums[i];
        //     }else if(ans==nums[i]){
        //         freq++;
        //     }else{
        //         freq--;
        //     }
           
        // }
        //  return ans;
    }
}