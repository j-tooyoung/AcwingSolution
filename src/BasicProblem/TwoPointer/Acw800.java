package BasicProblem.TwoPointer;

import java.util.HashMap;
import java.util.Scanner;

/**
 * ClassName: Acw800
 * Package: BasicProblem.TwoPointer
 * Description:
 *
 * @date: 2020/3/18 16:35
 * @author: tooyoung
 */

public class Acw800 {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        int n, m, x;
        n = sc.nextInt();
        m = sc.nextInt();
        x = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[m];
        // 法2 双指针
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            B[i] = sc.nextInt();
        }
        for (int i = 0, j = m - 1; i < n; i++) {
            while (j >= 0 && A[i] + B[j] > x) j--;
            if (A[i] + B[j] == x)
                System.out.println(i + " " + j);
        }
        // 法1
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            A[i] = sc.nextInt();
//            map.put(A[i], i);
//        }
//        for (int i = 0; i < m; i++) {
//            B[i] = sc.nextInt();
//            if (map.get(x - A[i]) != null)
//                System.out.println(map.get(x - A[i]) + " " + i);
//        }
//
    }
}
