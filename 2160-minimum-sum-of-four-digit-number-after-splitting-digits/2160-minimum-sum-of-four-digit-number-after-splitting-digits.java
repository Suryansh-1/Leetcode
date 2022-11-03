class Solution {
    public int minimumSum(int num) {
       int i=0;
        int num1[]=new int[4];
        while(num>0)
        {
            num1[i++]=num%10;
            num=num/10;
            
        }
        Arrays.sort(num1);
         int n1=num1[3]+10*num1[0];
        int n2=num1[2]+ 10*num1[1];
        return n1+n2;
}
}