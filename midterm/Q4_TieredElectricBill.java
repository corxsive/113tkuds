import java.util.*;
import static java.lang.Math.*;
public class Q4_TieredElectricBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        double[] kWh = new double[n];
        double total = 0.0;
        for (int i = 0; i < n; ++i) {
            kWh[i] = Double.parseDouble(sc.nextLine());
            double amount = calculateBill(kWh[i]);
            //round up amount
            amount = Math.round(amount); // Round to two decimal places
            System.out.printf("Bill: $%.0f\n", amount);
            total += amount;
        }
        double average = total / n;
        System.out.printf("Total: $%.0f\n", total);
        System.out.printf("Average: $%.0f\n", average);
    }
    private static double calculateBill(double kWh) {
        if (kWh <= 120) {
            return kWh * 1.68;
        } else if (kWh <= 330) {
            return 120 * 1.68 + (kWh - 120) * 2.45;
        } else if (kWh <= 500) {
            return 120 * 1.68 + (330 - 120) * 2.45 + (kWh - 330) * 3.70;
        } else if (kWh <= 700) {
            return 120 * 1.68 + (330 - 120) * 2.45 + (500 - 330) * 3.70 + (kWh - 500) * 5.04;
        } else if (kWh <= 1000) {
            return 120 * 1.68 + (330 - 120) * 2.45 + (500 - 330) * 3.70 + (700 - 500) * 5.04 + (kWh - 700) * 6.24;
        } else {
            return 120 * 1.68 + (330 - 120) * 2.45 + (500 - 330) * 3.70 + (700 - 500) * 5.04 + (1000 - 700) * 6.24 + (kWh - 1000) * 8.46;
        }
    }
    // Complexity: O(n) FOR(i,n,++i) for input parsing and bill calculation
    // Each bill calculation is O(1), so overall complexity is O(n)
}