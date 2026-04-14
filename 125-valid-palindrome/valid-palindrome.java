class Solution {
    public boolean isPalindrome(String s) {
         if(s.isEmpty()){
            return true;
         }
         int low=0;
         int high=s.length()-1;
         while(low<high){
            char first=s.charAt(low);
            char last=s.charAt(high);
            if(!Character.isLetterOrDigit(first)){
                low++;
                continue;
            }
            if(!Character.isLetterOrDigit(last)){
                high--;
                continue;
            }
            if(Character.toLowerCase(first)!=Character.toLowerCase(last)){
                return false;
            }
            low++;
            high--;
         }
         return true;
    }
}