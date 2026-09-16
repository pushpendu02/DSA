class Solution {
    public int maxArea(int[] height) {
        // int maxwater=0;
        // for(int i=0;i<height.length;i++){
        //     for(int j=i+1;j<height.length;j++){
        //         int wdt=j-i;
        //         int ht=Math.min(height[i],height[j]);
        //         int area=wdt*ht;
        //         maxwater=Math.max(maxwater,area);
        //     }
        // }
        // return maxwater;
        int maxwater=0;
        int i=0,j=height.length-1;
        while(i<j){
            int wdt=j-i;
            int ht=Math.min(height[i],height[j]);

            int area=ht*wdt;
            maxwater=Math.max(maxwater,area);
            ht=height[i]<height[j]?i++:j--;
        }
        return maxwater;
    }
}