import java.util.*;
import static java.lang.Math.*;
public class Q5_CPBLPrefixWins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] input = new int[n];
        for (int i = 0; i < n; ++i) {
            input[i] = Integer.parseInt(sc.next());
        }
        int k = sc.nextInt();
        StringBuilder sb = new StringBuilder("PrefixSum: ");
        int sum = 0;
        for (int i = 0; i < k; ++i) {
            sum += input[i];
            sb.append(sum).append(" ");
        }
        System.out.println(sb.toString().substring(0, sb.length() - 1)); // Remove the last space
    }
    // Complexity: O(n) FOR(i,n,++i) for input parsing and O(k) FOR(i,k,++i) for prefix sum calculation
    // Overall complexity is O(n + k), but since k <= n, it simplifies to O(n)
    // Input parsing is O(n) as well, so overall complexity is O(n)
}