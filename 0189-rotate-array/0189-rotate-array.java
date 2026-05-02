class Solution {
    // void reverse(int[]arr,int i,int j){
    //     while(i<j){
    //         int temp=arr[i];
    //         arr[i]=arr[j];
    //         arr[j]=temp;
    //         i++;
    //         j--;
    //     }
    // }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        // k=k%n;//that's denote how many number rotate[ex-3%7=3]
        // reverse(nums,0,n-1);//rotate entire array
        // reverse(nums,0,k-1);//rotate first k element
        // reverse(nums,k,n-1);//rotate remaining element
        int []b=new int [n];
        for(int i=0;i<n;i++){
            b[(i+k)%n]=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=b[i];
        }

    }
}