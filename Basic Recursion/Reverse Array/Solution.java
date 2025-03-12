class Solution {
    public void reverseArray(int arr[]) {
    // code here
    int n=arr.length,start=0,end=n-1,temp;
    revarr(arr,start,end);
    }
    public void revarr(int arr[],int start,int end){
        if(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            revarr(arr,start+1,end-1);
        }
        
    }
}
