class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int idx = -1;

        // 1. Find rotation index (where order breaks)
        for(int i = 0; i < n - 1; i++){
            if(nums[i] > nums[i + 1]){
                idx = i + 1;
                break;
            }
        }

        // If no break → already sorted
        if(idx == -1) return true;

        // 2. Rotate array
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            b[i] = nums[(i + idx) % n];
        }

        // 3. Check if rotated array is sorted
        for(int i = 0; i < n - 1; i++){
            if(b[i] > b[i + 1]){
                return false;
            }
        }

        return true;
    }
}