package BasicProblem.TwoPointer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * ClassName: Acw799
 * Package: BasicProblem.TwoPointer
 * Description:
 * Acw799最长不连续重复子序列
 * @date: 2020/3/18 16:34
 * @author: tooyoung
 */

public class Acw799 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            System.out.println(arr[i]);
        }
        System.out.println(maxCount(arr, n));
        System.out.println(maxCount1(arr, n));
    }

    private static int maxCount1(int[] arr, int n) {
        int pre = -1;
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.get(arr[i]) != null) {
                int index = map.get(arr[i]);
                pre = Math.max(pre, index);
            }
            res = Math.max(res, i - pre +1);
            map.put(arr[i], i);
        }
        return res;
    }

    private static int maxCount(int[] arr, int n) {
        int res = 0;
        int[] cnt = new int[100010];
        for (int l = 0, r = 0; r < n; l++) {
            cnt[arr[r]]++;
            while (l < r && cnt[arr[r]] > 1) { cnt[arr[l]]--;l++;}
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
