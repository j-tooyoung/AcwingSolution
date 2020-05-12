package BasicProblem.AddSub;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ClassName: Acw792
 * Package: BasicProblem.AddSub
 * Description:
 *
 * @date: 2020/3/18 16:06
 * @author: tooyoung
 */

public class Acw792 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = null, y = null;
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();
        x = sc.next();
        y = sc.next();
        for (int i = x.length() -1; i >= 0; i--) a.add(x.charAt(i) - '0');
        for (int i = y.length() -1; i >= 0; i--) b.add(y.charAt(i) - '0');
        if (cmp(a,b)) c = sub(a, b);
        else {
            c =sub(b,a);
            System.out.print("-");
        }
        for (int i = c.size() - 1; i >= 0; i--) {
            System.out.print(c.get(i));
        }
    }

    private static ArrayList<Integer> sub(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> res = new ArrayList<>();
        int t = 0;
        for (int i = 0; i <= a.size() - 1; i++) {
            t += a.get(i);
            if (i < b.size()) t -= b.get(i);
            res.add((t + 10) % 10);
            if (t < 0) t = -1;
            else t = 0;
        }
        while (res.size() > 1 && res.get(res.size() - 1) == 0) res.remove(res.size() - 1);
        return res;
    }

    private static boolean cmp(ArrayList<Integer> a, ArrayList<Integer> b) {
        if (a.size()!=b.size()) return a.size() > b.size();
        for (int i = a.size() - 1; i >= 0; i++) {
            if (a.get(i) != b.get(i)) return a.get(i) > b.get(i);
        }
        return true;
    }
}
