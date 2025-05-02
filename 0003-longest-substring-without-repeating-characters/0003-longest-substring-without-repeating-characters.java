class Solution {
    public int lengthOfLongestSubstring(String s) {
        String temp="",longestStr="";
        for(int i=0;i<s.length();i++){
            if(temp.contains(Character.toString(s.charAt(i)))){
                if(longestStr.length()<temp.length()) longestStr=temp;
                if((temp.length())-temp.indexOf(Character.toString(s.charAt(i)))>1)temp=temp.substring(temp.indexOf(Character.toString(s.charAt(i)))+1,temp.length());
                else temp="";
            }
            temp=temp+s.charAt(i);
        }
        if(longestStr.length()<temp.length()) return temp.length();
        return longestStr.length();
    }
}