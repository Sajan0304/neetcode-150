class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        Arrays.fill(dp,-1);
        int result=coinsChange(coins,amount,dp);
        if(result==Integer.MAX_VALUE){
            return -1;
        }
        else{
            return result;
        }
        
    }
    private int coinsChange(int[] coins,int amount,int[] dp){
        if(amount==0){
            return 0;
        }
        if(amount<0){
            return Integer.MAX_VALUE;
            
        }
        if(dp[amount]!=-1){
            return dp[amount];
        }
        int min=Integer.MAX_VALUE;
        for(int coin:coins){
            int res=coinsChange(coins,amount-coin,dp);

            if(res!=Integer.MAX_VALUE){
                min=Math.min(min,res+1);
            }
        }
        dp[amount]=min;
        return dp[amount];
    }
}
