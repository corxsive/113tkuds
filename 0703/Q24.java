import java.util.*;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        int sum = 1;
        for(int i=1; i<=line; ++i) {
            sum *= i;
        }
        System.out.println(sum);
    }
}