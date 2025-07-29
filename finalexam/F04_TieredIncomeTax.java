import java.util.*;

public class F04_TieredIncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        double[] incomes = new double[n];
        double totalTax = 0.0;

        for (int i = 0; i < n; ++i) {
            incomes[i] = Double.parseDouble(sc.nextLine());
            double tax = calculateTax(incomes[i]);
            System.out.printf("Tax: $%.2f\n", tax);
            totalTax += tax;
        }

        double averageTax = totalTax / n;
        System.out.printf("Average: $%.2f\n", averageTax);
    }

    private static double calculateTax(double income) {
        if (income <= 590000) {
            return income * 0.05;
        } else if (income <= 1330000) {
            return 590000 * 0.05 + (income - 590000) * 0.12;
        } else if (income <= 2660000) {
            return 590000 * 0.05 + (1330000 - 590000) * 0.12 + (income - 1330000) * 0.2;
        } else if (income <= 4980000) {
            return 590000 * 0.05 + (1330000 - 590000) * 0.12 + (2660000 - 1330000) * 0.2 + (income - 2660000) * 0.3;
        } else {
            return 590000 * 0.05 + (1330000 - 590000) * 0.12 + (2660000 - 1330000) * 0.2 + (4980000 - 2660000) * 0.3
                    + (income - 4980000) * 0.4;
        }
    }
    // Complexity: O(n) for input parsing and tax calculation
}
