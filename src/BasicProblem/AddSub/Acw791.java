package BasicProblem.AddSub;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ClassName: Acw791
 * Package: BasicProblem.AddSub
 * Description:
 *  高精度加法
 * @date: 2020/3/18 16:05
 * @author: tooyoung
 */

public class Acw791 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = null, y = null;
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
//        while (sc.hasNext()) { }
        x = sc.next();
        y = sc.next();
        for (int i = x.length() -1; i >= 0; i--) A.add(x.charAt(i) - '0');
        for (int i = y.length() - 1; i >= 0; i--) B.add(y.charAt(i) - '0');
//        for (int i = 0; i < A.size(); i++) {
//            System.out.println(A.get(i));
//        }

        ArrayList<Integer> C = add(A, B);
        for (int i = C.size() -1; i >= 0; i--) {
            System.out.print(C.get(i));
        }
    }

    private static ArrayList<Integer> add(ArrayList<Integer> a, ArrayList<Integer> b) {
        if (a.size() < b.size()) return add(b, a);
        final ArrayList<Integer> res = new ArrayList<>();
        int t = 0;
        for (int i = 0; i < a.size(); i++) {
            t += a.get(i);
            if (i < b.size()) t += b.get(i);
            res.add(t % 10);
            t /= 10;
        }
        if (t != 0) res.add(t);
        return res;
    }
}
