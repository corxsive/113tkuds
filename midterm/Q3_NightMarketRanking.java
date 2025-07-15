import java.util.*;
import static java.lang.Math.*;
public class Q3_NightMarketRanking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Double[] scores = new Double[n];
        for (int i = 0; i < n; ++i) {
            scores[i] = Double.parseDouble(sc.nextLine());
        }
        Arrays.sort(scores, Collections.reverseOrder()); // Sort in descending order
        for (int i = 0; i < Math.min(5, n); ++i) {
            System.out.printf("%.1f\n", scores[i]);
        }
    }
    // Complexity: O(n log n) due to sorting, O(n) for input parsing
    // Overall complexity is O(n log n)
}