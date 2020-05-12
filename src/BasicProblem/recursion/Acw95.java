package BasicProblem.recursion;

import java.util.Scanner;

/**
 * ClassName: Acw95
 * Package: BasicProblem.recursion
 * Description:
 *  费解的开关
 * @date: 2020/3/18 14:58
 * @author: tooyoung
 */

public class Acw95 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        while (n-- > 0) {
            init();
            if (work() <= 6) System.out.println(res);
            else System.out.println("-1");
        }
    }

    static int[][] a = new int[7][7];
    static int[][] b = new int[7][7];
    static int res;

    static void init() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                char[] row = sc.next().toCharArray();
                for (int k = 0; k < 5; k++) {
                    a[j][k + 1] = row[k] - '0';
                }
            }
        }
    }

    static void flip(int x, int y) {
        b[x][y] ^= 1;
        b[x - 1][y] ^= 1;
        b[x ][y +1] ^= 1;
        b[x ][y -1] ^= 1;
        b[x + 1][y] ^= 1;
    }

    static boolean judge() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (b[i][j] == 0) return false;
            }
        }
        return true;
    }

    static int work() {
        res = 10000000;
        for (int i = 1; i <= (1 << 5); i++) {
            int ans = 0;

        }
        return 0;
    }

}
