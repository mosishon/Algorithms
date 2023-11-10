package dynamicProgarmming.longestcommonsubsequence;

public class LCS {
    public static int longestCommonSubsequence(char[] x, char[] y, int m, int n){
        if( m == 0 || n == 0){
            return 0;
        }
        if (x[m-1] == y[n -1]){
            return longestCommonSubsequence(x,y,m-1,n-1) + 1;
        }else{
            int p = longestCommonSubsequence(x,y,m,n-1);
            int q = longestCommonSubsequence(x,y,m -1,n);
            int max = Math.max(p,q);
            return max;
        }
    }
}
