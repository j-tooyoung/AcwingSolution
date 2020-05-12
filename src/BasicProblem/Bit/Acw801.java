package BasicProblem.Bit;

import java.util.BitSet;
import java.util.Scanner;

/**
 * ClassName: Acw801
 * Package: BasicProblem.Bit
 * Description:
 * 比特中1的个数
 * @date: 2020/3/18 16:35
 * @author: tooyoung
 */

public class Acw801 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Integer.bitCount(n));

        int cnt = 0;
        while (n != 0) {
            cnt++;
            n &= (n - 1);
        }
//        Integer a = new Integer(n);
        System.out.println(cnt);

     }
}
