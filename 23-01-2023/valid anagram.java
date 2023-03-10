class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int []count1=new int [26];
        int []count2=new int [26];
        for(int i=0;i<s.length();i++){
            count1[s.charAt(i)-'a']++;
            count2[t.charAt(i)-'a']++;
        }
        for(int j=0;j<26;j++){
            if(count1[j]!=count2[j]){
                return false;
            }
        }
        return true;
    }
}
