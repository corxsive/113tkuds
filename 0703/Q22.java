import java.util.*;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=line; ++i) {
            if(i % 2 == 1) 
                continue;
            sum += i;
        }
        System.out.println(sum);
    }
}