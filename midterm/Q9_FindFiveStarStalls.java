import java.util.*;
import static java.lang.Math.*;
public class Q9_FindFiveStarStalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        double[] scores = new double[n];
        for (int i = 0; i < n; ++i) {
            scores[i] = sc.nextDouble();
        }
        int count = 0;
        for (int i = 0; i < n; ++i) {
            if (scores[i] == 5.0) {
                System.out.print(i + " ");
                ++count;
            }
        }
        if (count == 0) {
            System.out.println("None");
        }
    }
}