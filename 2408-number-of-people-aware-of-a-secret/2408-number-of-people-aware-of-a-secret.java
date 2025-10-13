class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int MOD = (int)1e9 + 7;
        int[] dp = new int[n + 1];
        dp[1] = 1;

        
        for (int d = 1; d <= n; d++) {
            if (dp[d] == 0) continue;
            for (int future = d + delay; future < d + forget && future <= n; future++) {
                dp[future] = (dp[future] + dp[d]) % MOD;
            }
        }

        
        int t = 0;
        for (int d = n - forget + 1; d <= n; d++) {
            if (d >= 1) {
                t = (t + dp[d]) % MOD;
            }
        }
        return t;
    }
}
