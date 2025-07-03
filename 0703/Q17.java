import java.util.*;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        if(line >= 90 && line <= 100) {
            System.out.println("A");
        } else if(line >= 80 && line < 90) {
            System.out.println("B");
        } else if(line >= 70 && line < 80) {
            System.out.println("C");
        } else if(line >= 60 && line < 70) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}