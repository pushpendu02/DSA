class Solution {
    public int findDuplicate(int[] nums) {
    //     HashSet<Integer>set=new HashSet<>();
    
    //     int n=nums.length;
    //     for(int i=0;i<n;i++){
    //         if(set.contains(nums[i])){
    //             return nums[i];
    //         }else{
    //             set.add(nums[i]);
    //         }
    //     }
        
    // return -1;
    int slow=nums[0];
    int fast=nums[0];
    do{
        slow=nums[slow];
        fast=nums[nums[fast]];
    }while(slow!=fast);
    slow=nums[0];
    while(slow!=fast){
        slow=nums[slow];
        fast=nums[fast];
    }
    return slow;
    }
    
}