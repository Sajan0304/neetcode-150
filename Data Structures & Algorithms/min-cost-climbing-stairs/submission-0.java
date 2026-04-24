class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[]dp=new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(minCostClimbingStairs(cost,0,dp),minCostClimbingStairs(cost,1,dp));
        
    }
    private int minCostClimbingStairs(int[] cost,int i,int[]dp){
        if(i>=cost.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        dp[i]=cost[i]+Math.min(minCostClimbingStairs(cost,i+1,dp),minCostClimbingStairs(cost,i+2,dp));
        return dp[i];
    }
}
