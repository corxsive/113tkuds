import java.util.*;

public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        for(int i=1; i<=line; ++i) {
            for(int j=1; j<=line; ++j) {
                // if(j == 1) {
                //     System.out.print(i * j);
                // } else {
                    System.out.print(String.format("%4s", i*j));
                // }
            }
            System.out.println();
        }
    }
}