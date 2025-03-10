class Solution {
    
    public void printNos(int n) {
        printRecursive(1,n);
        
    }
    public void printRecursive(int curr,int n){
        if(curr>n){
            return;
        }
        System.out.print(curr+" ");
        printRecursive(curr+1,n);
    }
}
