package BasicProblem.greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * AcWing 913. 排队打水
 *
 * https://blog.csdn.net/qq_40388485/article/details/101471014
 *
 */
public class Acw913 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int res = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int cnt = n - 1;
        for (int i = 0; i < n; i++) {
            res += a[i] * cnt;
            cnt--;
        }
        System.out.println(res);

    }

}
