// User function Template for Java
class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> result=new ArrayList<>();
        fact(1,1,n,result);
        return result;
    }
    static  void fact(long curr,long i,long n,ArrayList<Long>result){
        if(curr>n){
        return;   
        }
        result.add(curr);
        fact(curr*(i+1),i+1,n,result);
    }
}
