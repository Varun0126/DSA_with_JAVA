class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public List<Integer> frequencyCount(int[] arr) {
        // do modify in the given array
        int n=arr.length;
        int [] hash_arr=new int[n+1];
        for(int i=0;i<n;i++){
            if(arr[i]>=1 && arr[i]<=n){
                hash_arr[arr[i]]++;
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=hash_arr[i+1];
        }
        List<Integer> result= new ArrayList<>();
        for (int num:arr){
            result.add(num);
        }
        return result;
    }
}
