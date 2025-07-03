import java.util.*;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        System.out.println(((line % 4 == 0 && line % 100 != 0) || line % 400 == 0) ? "Yes" : "No");
    }
}