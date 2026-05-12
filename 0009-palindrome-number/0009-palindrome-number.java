class Solution {
    public boolean isPalindrome(int x) {
        int reverse=0;
        int remainder;
        int org=x;
        if(x>0){
        while(x!=0){
            remainder=x%10;
            reverse=reverse*10+remainder;
            x=x/10;
        }      
        }
        if(org==reverse){
            return true;
        }
        else{
            return false;
        }
    }
}