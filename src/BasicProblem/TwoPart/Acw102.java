package BasicProblem.TwoPart;

import java.util.Scanner;

/**
 * ClassName: Acw102
 * Package: BasicProblem.TwoPart
 * Description:
 *
 * @date: 2020/3/18 14:30
 * @author: tooyoung
 */

public class Acw102 {
    static int N, F;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        F = sc.nextInt();
        double[] arr = new double[N + 1];
        double l = 0, r = 0;
        for (int i = 1; i <= N; i++) {
            arr[i] = sc.nextDouble();
            r = Math.max(arr[i], r);
        }

        while (r - l > 1e-5) {
            double mid = (r + 1)/2;
            if (check(arr,mid)) l = mid;
            else r = mid;
        }
        System.out.printf("%d\n", (int) (r * 1000));
    }

    private static boolean check(double[] arr, double avg) {
        double[] sum = new double[arr.length];
        for (int i = 1; i <= N; i++) {
            sum[i] = sum[i - 1] + arr[i] - avg;
        }
        double minv = 0;
        for (int i = 0, j = F; j <= N; i++, i++) {
            minv = Math.min(minv, sum[i]);
            if (sum[i] - minv >= 0) return true;
        }
        return false;
    }
}
