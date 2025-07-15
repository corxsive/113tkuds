import java.util.*;
import static java.lang.Math.*;
public class Q8_MergeTHSRPriceTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] stations = new String[n];
        int [][] prices = new int[n][2];
        for (int i = 0; i < n; ++i) {
            String[] parts = sc.nextLine().split(" ");
            stations[i] = parts[0];
            prices[i][0] = Integer.parseInt(parts[1]);
            prices[i][1] = Integer.parseInt(parts[2]);
        }
        System.out.println("Station|Standard|Business");
        for (int i = 0; i < n; ++i) {
            String station = stations[i];
            int standardPrice = prices[i][0];
            int businessPrice = prices[i][1];
            System.out.printf("%s|%d|%d%n", station, standardPrice, businessPrice);
        }
    }
}