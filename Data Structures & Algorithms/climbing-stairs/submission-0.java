class Solution {
    public int climbStairs(int n) {
        int []dp=new int[n];
        Arrays.fill(dp,-1);
        return  climbsStairs(n,0,dp);
        
    }
    private int climbsStairs(int n,int i,int[] dp){
        if(i>n){
            return 0;
        }
        else if(i==n){
            return 1;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        dp[i]= climbsStairs(n,i+1,dp)+ climbsStairs(n,i+2,dp);
        return dp[i];
    }
}
