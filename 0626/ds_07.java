import java.util.*;

public class ds_07 {
    public static void main(String[] args) {
        int [][] arr = new int[3][3];
        for(int i=0; i<3; ++i) {
            for(int j=0; j<3; ++j) {
                arr[i][j] = (i+1) * (j+1);
            }
        }

        for(int[] el_arr : arr) {
            for(int el : el_arr) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }
}