class Solution {
    public int lengthOfLongestSubstring(String s) {
       int n = s.length();
       HashMap<Character,Integer> mp = new HashMap<>();

       int start = 0, end = 0, maxLen = 0;
       while(end<n){
        char ch = s.charAt(end);
        if(mp.containsKey(ch)){
            start = Math.max(start,mp.get(ch)+1);
        }
        mp.put(ch,end);

        maxLen = Math.max(maxLen, end-start+1);
        end++;
       }
         return maxLen;
    }
}