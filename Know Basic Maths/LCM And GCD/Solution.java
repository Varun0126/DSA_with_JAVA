class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        int gcd=1;
        for (int i=1;i<=Math.min(a,b);i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        int lcm=(a*b)/gcd;
        return new int[]{lcm,gcd} ;
    }
}
