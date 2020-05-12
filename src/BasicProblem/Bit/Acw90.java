package BasicProblem.Bit;

import java.util.Scanner;

/**
 * ClassName: Acw90
 * Package: BasicProblem.Bit
 * Description:
 * 64位整数乘法
 * @date: 2020/3/18 16:35
 * @author: tooyoung
 */

public class Acw90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long p = sc.nextLong();
        System.out.println(mod(a,b,p));
        System.out.println(mod2(a,b,p));
    }

    private static long mod2(long a, long b, long m) {
        a = (a % m + m) % m;
        b = (b % m + m) % m;
        long ans = a * b - (long) (( double) a * b / m + 0.5) * m;
        return ans < 0? ans + m : ans;
    }

    private static long mod(long a, long b, long p) {
        long res = 0;
        while (b != 0) {
            if ((b & 1) == 1) res = (res + a) % p;
            b >>= 1;
            a = a * 2 % p;
        }
        return res;
    }


}
