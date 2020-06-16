package BasicProblem.greedy;

import java.util.*;

/**
 * AcWing 148. 合并果子
 * https://www.acwing.com/problem/content/150/
 */
public class Acw148 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            pq.add(a[i]);
        }

        int res = 0;

        while (pq.size() >= 2) {
            int m = pq.poll();
            int k = pq.poll();
            //  System.out.println(m+" " + k);
            res += m + k;
            pq.add(m + k);
        }
        System.out.println(res );
    }

}
