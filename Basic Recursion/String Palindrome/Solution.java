class Solution {
    public boolean isPalindrome(String s) {
        String str=cleanstring(s);
        return checkPalindrome(str,0,str.length()-1);
    }
    public boolean checkPalindrome(String s,int start,int end){
        if(start>=end){
            return true;
        }
        else if(s.charAt(start)!=s.charAt(end)){
            return false;
        }
        return checkPalindrome(s,start+1,end-1);
    }
    public String cleanstring(String s){
        StringBuilder sb=new StringBuilder();
        for(char e:s.toCharArray()){
            if(Character.isLetterOrDigit(e)){
                sb.append(Character.toLowerCase(e));
            }
        }
        return sb.toString();
    }
}
