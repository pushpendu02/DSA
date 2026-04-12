class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int high=nums.length-1;
        divide(nums,low,high);
    }
    public void divide(int []nums,int low,int high){
        if(low>=high){
            return;
        }
        int mid=low+(high-low)/2;
        divide(nums,low,mid);
        divide(nums,mid+1,high);
        concure(nums,low,mid,high);
    }
    public void concure(int []nums,int low,int mid,int high){
    int merged[]=new int[high-low+1];
    int idx1=low;
    int idx2=mid+1;
    int x=0;
    while(idx1<=mid&&idx2<=high){
        if(nums[idx1]<=nums[idx2]){
            merged[x++]=nums[idx1++];
        }else{
            merged[x++]=nums[idx2++];
        }
    }
    while(idx1<=mid){
        merged[x++]=nums[idx1++];
    }
    while(idx2<=high){
        merged[x++]=nums[idx2++];
    }
    for(int i=0;i<merged.length;i++){
        nums[low+i]=merged[i];
    }

}
}
