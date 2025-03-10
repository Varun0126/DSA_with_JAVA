class Solution {
    int sumOfSeries(int n) {
        return sumofCubes(n);
    }
    public int sumofCubes(int n){
        if (n==1){
            return 1;
        }
        return (n*n*n)+sumofCubes(n-1);
    }
}
