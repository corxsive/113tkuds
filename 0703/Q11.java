import java.util.*;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        int ii = Integer.parseInt(line[0]);
        int jj = Integer.parseInt(line[1]);
        int [][] arr = new int[ii][jj];
        for(int i=0; i<ii; ++i) {
            line = sc.nextLine().split(" ");
            for(int j=0; j<line.length; ++j) {
                arr[i][j] = Integer.parseInt(line[j]);
            }
        }
        for(int j=0; j<jj; ++j) {
            int total = 0;
            for(int i=0; i<ii; ++i) {
                total += arr[i][j];
            }
            System.out.print(total + " ");
        }
    }
}