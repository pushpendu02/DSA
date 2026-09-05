class Solution {
    public boolean isMonotonic(int[] nums) {
     boolean increas=true;
     boolean decreas=true;
     for(int i=1;i<nums.length;i++){
        if(nums[i]>nums[i-1]){
            decreas=false;
        }else if(nums[i]<nums[i-1]){
            increas=false;
        }
        if(!increas && !decreas){
            return false;
        }

     }
     return true;
    }
}