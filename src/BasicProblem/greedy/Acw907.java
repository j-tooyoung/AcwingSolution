package BasicProblem.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * AcWing 907. 区间覆盖
 *
 *
 * https://blog.csdn.net/qq_43515011/article/details/103862881?utm_medium=distribute.pc_relevant_t0.none-task-blog-BlogCommendFromMachineLearnPai2-1.nonecase&depth_1-utm_source=distribute.pc_relevant_t0.none-task-blog-BlogCommendFromMachineLearnPai2-1.nonecase
 * https://blog.csdn.net/qq_30277239/article/details/104002724?utm_medium=distribute.pc_relevant.none-task-blog-baidujs-4
 */
public class Acw907 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();
        Pair[] pairs = new Pair[n];
        int ai, bi;
        int res = 0;
        for (int i = 0; i < n; i++) {
            ai = sc.nextInt();
            bi = sc.nextInt();
            pairs[i] = new Pair(ai, bi);
        }
        Arrays.sort(pairs, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.getFront() -o2.getFront();
            }
        });

        for (int i = 0; i < n; i++) {

        }
        System.out.println(res);
    }
}

