class Solution {
    public int reverse(int x) {
        int temp=x,num=0;

        while(temp!=0){
            if(num<Integer.MIN_VALUE/10 || num>Integer.MAX_VALUE/10){
                return 0;
            }
            num=num*10+temp%10;
            temp=temp/10;
        }
                
        return num;
      
    }
}
