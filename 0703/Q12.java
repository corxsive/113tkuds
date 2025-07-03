import java.util.*;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = Integer.parseInt(sc.nextLine());
        for(int i=1; i<=line; ++i) {
            for(int j=1; j<=i; ++j) {
                System.out.print(j);
                if(j != i)
                    System.out.print(" ");
            }
            for(int j=i-1; j>0; --j) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }
}