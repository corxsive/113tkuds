import java.util.*;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        int[][] arr = new int[line][line];
        int curr = 0;
        //k m l n
        int w = 0, ww = line, h = 0, hh = line;
        while(w < ww && h < hh) {
            for(int i=h; i<hh; ++i) {
                arr[w][i] = ++curr;
            }
            ++w;
            for(int i=w; i<ww; ++i) {
                arr[i][hh-1] = ++curr;
            }
            --hh;
            if(w < ww) {
                for(int i=hh-1; i >= h; --i) {
                    arr[ww-1][i] = ++curr;
                }
                --ww;
            }
            if(h < hh) {
                for(int i=ww-1; i>= w; --i) {
                    arr[i][h] = ++curr;
                }
                ++h;
            }
        }

        for(int i=0; i<arr.length; ++i) {
            for(int j=0; j<arr[0].length; ++j) {
                System.out.print(arr[i][j]);
                if(j != arr[0].length - 1)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}