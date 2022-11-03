class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0,sum1=1;
        while(n>0)
        {
            int r=n%10;
            sum=sum+r;
            sum1=sum1*r;
            n=n/10;
        }
        return sum1-sum;
    }
}