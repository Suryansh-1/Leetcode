class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int y=x;
        int ans=0;
        while(y>0){
            ans=ans*10+(y%10);
            y/=10;
        }
        
        if(ans==x)
            return true;
        
        return false;
    }
}