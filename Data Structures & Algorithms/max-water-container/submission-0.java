class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j=heights.length-1;
        int mx=0;
        while(j>i){
            mx = Math.max(mx,(Math.min(heights[i],heights[j])*(j-i)));
            if(heights[i]<=heights[j]) i++;
            else if(heights[i]>heights[j]) j--;

        }
        return mx;
    }
}
