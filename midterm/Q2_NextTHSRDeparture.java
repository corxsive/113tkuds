import java.util.*;
import static java.lang.Math.*;
public class Q2_NextTHSRDeparture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] stops = new int[n];
        for (int i = 0; i < n; ++i) {
            String line = sc.nextLine();
            int[] parts = Arrays.stream(line.split(":")).mapToInt(Integer::parseInt).toArray();
            stops[i] = parts[0] * 60 + parts[1]; // Convert to minutes
        }
        String target = sc.nextLine();
        int[] targetParts = Arrays.stream(target.split(":")).mapToInt(Integer::parseInt).toArray();
        int targetTime = targetParts[0] * 60 + targetParts[1];
        int inTime = -1;
        for (int i = 0; i < n; ++i) {
            if (targetTime <= stops[i]) {
                inTime = i;
                break;
            }
        }
        System.out.println((inTime == -1 ? "No Train" : String.format("%02d:%02d", stops[inTime] / 60, stops[inTime] % 60)));
    }
    // Complexity: O(n) FOR(i,n,++i)
    // Input parsing is O(n) as well, so overall complexity is O(n)
}