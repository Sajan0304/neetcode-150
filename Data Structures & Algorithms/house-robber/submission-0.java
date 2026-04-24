class Solution {
    public int rob(int[] nums) {
        int[]dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return robbing(nums,0,dp);
        
    }
    private int robbing(int[]nums,int i,int[]dp){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        dp[i]=Math.max(nums[i]+robbing(nums,i+2,dp),robbing(nums,i+1,dp));
        return dp[i];
    }
}
