class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int itr=0;
        int[]ans=new int[n];
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=0)
            {
                ans[itr]=nums[i];
                itr++;
            }
        }
         for (int i=0; i<n; i++) 
            nums[i] = ans[i];
    }
}
