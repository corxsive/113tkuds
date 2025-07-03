import java.util.*;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int h = Integer.parseInt(line.split(" ")[0]);
        int w = Integer.parseInt(line.split(" ")[1]);
        int[][] arr = new int[w][h];
        for(int i=0; i<h; ++i) {
            line = sc.nextLine();
            String[] s = line.split(" ");
            for(int j=0 ; j<s.length; ++j) {
                arr[j][i] = Integer.parseInt(s[j]);
            }
        }

        for(int i=0; i<w; ++i) {
            for(int j=0; j<h; ++j) {
                System.out.print(arr[i][j]);
                if(j != arr[0].length - 1) 
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}