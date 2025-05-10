class Solution {
    public boolean isPalindrome(String s) {
        if(s=="") return true;
        s=s.toLowerCase();
        for(int i=0,j=s.length()-1;i<=j;){
            if(!(Character.isLetter(s.charAt(i))||Character.isDigit(s.charAt(i)))) {
                i++; 
                continue;
            }
            else if(!(Character.isLetter(s.charAt(j))||Character.isDigit(s.charAt(j)))) {
                j--;
                continue;
            }
            else if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}