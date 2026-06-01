class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        char arr[] = s.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(j>i){
            if(!(((arr[i]>='a' && arr[i]<='z')) || arr[i]>='0' && arr[i]<='9')) i++;
            else if(!(((arr[j]>='a' && arr[j]<='z')) || arr[i]>='0' && arr[i]<='9')) j--;
            else{
            if(arr[j]!=arr[i]) return false;
            i++;
            j--;
            }
        }
        return true;
    }
}
