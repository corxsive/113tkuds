import java.util.*;

public class F03_ConvenienceHotItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] items_name = new String[n];
        int[] items_qty = new int[n];
        for (int i = 0; i < n; ++i) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            items_name[i] = parts[0];
            items_qty[i] = Integer.parseInt(parts[1]);
        }

        // Sort the items in descending order
        Insertsort(items_qty, items_name);

        // Print the top 10 items or fewer if there are not enough
        int limit = Math.min(10, n);
        for (int i = n - 1; i >= n - limit; --i) {
            System.out.println(items_name[i] + " " + items_qty[i]);
        }
    }

    public static void Insertsort(int[] arr, String[] arr2) {
        for (int i = 1; i < arr.length; ++i) {
            int curr = arr[i];
            String curr2 = arr2[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > curr) {
                arr[j + 1] = arr[j];
                arr2[j + 1] = arr2[j];
                --j;
            }
            arr[j + 1] = curr;
            arr2[j + 1] = curr2;
        }
    }
    // Complexity: O(n^2) in the worst case, O(n log n) in the average case
    // Input parsing is O(n) as well, so overall complexity is O(n^2)
}
