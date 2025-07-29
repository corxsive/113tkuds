import java.util.*;

public class F08_ClimbStairsMemo {
    private static int[] memo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        memo = new int[n + 1];
        System.out.println("Ways: " + climbStairs(n));
    }

    private static int climbStairs(int n) {
        if (n < 0)
            return 0;
        if (n == 0)
            return 1;
        if (memo[n] != 0)
            return memo[n];

        memo[n] = climbStairs(n - 1) + climbStairs(n - 2) + climbStairs(n - 3);
        return memo[n];
    }
}
