class Solution {
    static int result(char[]ch,int start,int end,int k){
        if(end-start<k){
            return 0;
        }
        int []count=new int[26];
        for(int i=start;i<end;i++){
            count[ch[i]-'a']++;
        }
        for(int v=start;v<end;v++){
            if(count[ch[v]-'a']<k){
                int j=v+1;
                while(j<end&&count[ch[j]-'a']<k){
                    j++;
                }
                return Math.max(result(ch,start,v,k),result(ch,j,end,k));
            }
        }
        return end-start;
    }
    public int longestSubstring(String s, int k) {
        return result(s.toCharArray(),0,s.length(),k);
    }
}
