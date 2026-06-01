class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        int sl = s.length();
        int tl = t.length();
        if(sl != tl) return false;
        for(int i=0;i<sl;i++){
            char c = s.charAt(i);
            int a = c - 'a';
            arr[a]++;
        }
        for(int i=0;i<tl;i++){
            char c = t.charAt(i);
            int a = c - 'a';
            arr[a]--;
        }

        for(int i=0;i<26;i++){
            if(arr[i]!=0) return false;
        }

        return true;




    }
}
