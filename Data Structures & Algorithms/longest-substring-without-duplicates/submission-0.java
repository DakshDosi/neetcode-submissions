class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] arr = new int[128 ];
        int l=0;
        int r=0;
        int ans=0;
        while(r<s.length()){
            int b = s.charAt(r);
            while(arr[b] > 0){
            arr[s.charAt(l)]--;
            l++;
            }
            arr[b]++;
            ans = Math.max(ans, r - l + 1);
            r++;
        }

        return ans;
    }
}
