class Solution {
    public boolean isPalindrome(int x) {
        int temp=x,num=0;
        while(temp>0){
            if(num<Integer.MIN_VALUE/10 || num>Integer.MAX_VALUE/10){
                return false;
            }
            num=num*10+temp%10;
            temp=temp/10;

        }
        if(num==x){
            return true;
        }
        return false;
    }
}
