class Solution {
    public String firstPalindrome(String[] words) {
        for(String s: words){
            for( int i=0,j=s.length()-1;i<=j;i++,j--){
                if(i==j||(i==j-1 && s.charAt(i)==s.charAt(j))) return s;
                else if(s.charAt(i)!=s.charAt(j)) break;
            }
        }
        return "";
    }
}