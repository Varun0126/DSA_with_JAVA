class Solution {
    public void reverseArray(int arr[]) {
    // code here
    int n=arr.length,left=0,right=n-1,temp;
    while(left<right){
        temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;
    }
    
    }    
}
