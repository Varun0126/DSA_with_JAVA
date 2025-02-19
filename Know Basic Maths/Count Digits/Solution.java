/*Given a positive integer n, count the number of digits in n that divide n evenly (i.e., without leaving a remainder). Return the total number of such digits.*/
// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        int temp=n,x,c=0;
        while(temp!=0){
            x=temp%10;
            
            if(x!=0 && n%x==0){
                c+=1;
            }
            temp=temp/10;
        }
        return c;
    }
}
