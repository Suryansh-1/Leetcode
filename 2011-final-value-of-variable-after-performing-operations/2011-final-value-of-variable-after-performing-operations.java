class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(int i=0;i<operations.length;i++)
        {
            String s=operations[i];
            if(s.equalsIgnoreCase("++X")||s.equalsIgnoreCase("X++"))
            
                x=x+1;
             if(s.equalsIgnoreCase("--X")||s.equalsIgnoreCase("X--"))
                x=x-1;
        }
        return x;
    }
}