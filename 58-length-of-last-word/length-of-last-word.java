class Solution {
    public int lengthOfLastWord(String s) {
       String[]parts=s.split(" ");
       int n=parts.length;
       int len= parts[n-1].length();
       return len;
        // int length = 0;
        // int i = s.length() - 1;

        // while (i >= 0 && s.charAt(i) == ' '){
        //     i--;
        // } 
        // while (i >= 0 && s.charAt(i) != ' ') {
        //     length++;
        //     i--;
        // }
        // return length;
    }
}