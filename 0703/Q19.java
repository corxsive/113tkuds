import java.util.*;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        boolean space = false;
        for (int i=2;i<=line;i++){
            boolean k = true;
            for (int n = 2; n < i; n++) {
                if (i % n == 0) {
                    k = false;
                    break;
                }
            }
            if(k){
                if(space) {
                    System.out.print(" ");
                } else {
                    space = true;
                }
                System.out.print(i);
            }
        }
    }
}