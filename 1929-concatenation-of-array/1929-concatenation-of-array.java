class Solution {
    public int[] getConcatenation(int[] nums) {
        int arr[]=new int[nums.length*2];
        int a=nums.length;
        int k=0;
        for(int i=0;i<a;i++)
            arr[k++]=nums[i];
            
            for(int i=0;i<a;i++)
                arr[k++]=nums[i];
            
            return arr;
            
            
            
    }
}