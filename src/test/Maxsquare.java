package test;

public class Maxsquare {

    public static void main(String[] args) {
        /**
         * 最大正方形
         */

        int[][] sq = {{0,1,1,0},{0,1,1,0},{0,1,1,0}};

        int i = sq.length;

        int j = sq[0].length;

        int maxLen = 0;


        int dp[][] = new int[i+1][j+1];

        for (int k = 1; k <=i; k++) {

            for (int l = 1; l <=j; l++) {

                if(sq[k-1][l-1]==1){

                    dp[k][l] = Math.min(dp[k-1][l-1],Math.min(dp[k][l-1],dp[k-1][l]))+1;

                    maxLen = Math.max(maxLen,dp[k][l]);
                }

            }

        }

        System.out.println(maxLen*maxLen);
    }
}
