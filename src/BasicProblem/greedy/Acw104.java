package BasicProblem.greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 104. 货仓选址
 * https://www.acwing.com/problem/content/106/
 * 题解
 * https://www.acwing.com/solution/content/5382/
 */
public class Acw104 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int res = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int mid = a[n / 2];
        for (int i = 0; i < n; i++) {
            res += Math.abs(a[i] - mid);
        }
        System.out.println(res);
    }
}
