package BasicProblem.DP;

import java.util.Scanner;

/**
 * AcWing 895. 最长上升子序列
 * <p>
 * https://www.acwing.com/solution/content/4807/
 * https://blog.csdn.net/qq_30277239/article/details/103879983
 */
public class Acw895 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] dp = new int[n];
        int res = 1;
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if ((a[j] < a[i])){
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }
            res = Math.max(res, dp[i]);
        }
        System.out.println(res);
    }

}

//7
//3 1 2 1 8 5 6

//4