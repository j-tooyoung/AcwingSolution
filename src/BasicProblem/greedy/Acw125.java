package BasicProblem.greedy;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 125. 耍杂技的牛
 * https://www.acwing.com/problem/content/127/
 */

// 题解
// https://www.acwing.com/solution/content/845/
public class Acw125 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] weigt = new int[N];
        int[] st = new int[N];
        List<pairs> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            weigt[i] = sc.nextInt();
            st[i] = sc.nextInt();
            list.add(new pairs(weigt[i], st[i]));
        }
//        Collections.sort(list, new Comparator<pairs>() {
//            @Override
//            public int compare(pairs o1, pairs o2) {
//                return o1.getSm() - o2.getSm();
//            }
//        });
        list = list.stream().sorted(Comparator.comparing(pairs::getSm)).collect(Collectors.toList());

        int res = (int)-2e9;
        int sum = 0;
        for(int i=0; i<N; i++){
            res = Math.max(res, sum - list.get(i).s);
            sum += list.get(i).w;
        }
        System.out.println(res);
    }
}

class pairs {
    int w;
    int s;

    int sm;

    public pairs(int w, int s) {
        this.w = w;
        this.s = s;
        this.sm = w + s;
    }

    public int getW() {
        return w;
    }

    public int getS() {
        return s;
    }

    public int getSm() {
        return sm;
    }
}
