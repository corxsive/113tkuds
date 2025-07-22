import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {
        int a = 1, b = 1;
        for (int i = 2; i < n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }
        return b;
    }
}
