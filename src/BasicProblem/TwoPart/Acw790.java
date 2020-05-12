package BasicProblem.TwoPart;

import java.util.Scanner;

/**
 * ClassName: Acw790
 * Package: BasicProblem.TwoPart
 * Description:
 *
 * @date: 2020/3/18 13:56
 * @author: tooyoung
 */

public class Acw790 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l = -10000, r = 10000;
        double target = sc.nextDouble();
        while (Math.abs(l - r) > 1e-7) {
            double mid = (l + r) / 2;
            if (mid *mid *mid > target) r = mid;
            else l = mid;
        }
        System.out.printf("%.6f", l);
    }
}
