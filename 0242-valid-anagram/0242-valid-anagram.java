class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }

        // Map<Character, Integer> counter = new HashMap<>();

        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     counter.put(ch, counter.getOrDefault(ch,0)+1);
        // }

        // for(int i=0;i<t.length();i++){
        //     char ch=t.charAt(i);
        //     if(!counter.containsKey(ch)||counter.get(ch)==0){
        //         return false;
        //     }
        //     counter.put(ch,counter.get(ch)-1);
        // }
        // return true;
        int count[]=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }
}