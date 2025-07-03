import java.util.*;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        boolean space = false;
        int sum = 0;
        for(int i=1; i<=line; ++i) {
            if(i % 2 == 0) 
                continue;
            sum += i;
        }
        System.out.println(sum);
    }
}