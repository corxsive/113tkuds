import java.util.*;
import static java.lang.Math.*;
public class Q1_THSRStopCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] stops = sc.nextLine().split(" ");
        String[] target = sc.nextLine().split(" ");
        int l = -1;
        int r = -1;
        for (int i = 0; i < n; ++i) {
            if (stops[i].equals(target[0])) {
                l = i;
            }
            if (stops[i].equals(target[1])) {
                r = i;
            }
        }
        System.out.println((l == -1 || r == -1 ? "Invalid" : abs(l - r) + 1));
    }
    // Complexity: O(n) FOR(i,n,++i)
    // Input parsing is O(n) as well, so overall complexity is O(n)
}