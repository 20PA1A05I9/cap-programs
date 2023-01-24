class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap <Character,Integer> dict = new HashMap <Character,Integer> ();
        int start = -1, mx = 0;
        for(int i=0;i<s.length();i++){
            if(dict.containsKey(s.charAt(i))&& start < dict.get(s.charAt(i)))
                start = dict.get(s.charAt(i));
            dict.put(s.charAt(i),i);
            mx = Math.max(mx,i - start);
        }
        return mx;
        
    }
}
