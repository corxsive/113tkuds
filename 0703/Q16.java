import java.util.*;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();// dummy
        line = sc.nextLine();
        String[] ls = line.split(" ");
        for(int i=ls.length-1; i>=0; --i) {
            System.out.print(ls[i]);
            if(i != 0)
                System.out.print(" ");
        }
    }
}