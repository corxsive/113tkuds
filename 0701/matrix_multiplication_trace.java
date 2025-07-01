import java.util.*;

public class matrix_multiplication_trace {
    public static void main(String[] args) {
        int[][] a = {
            {1,2},
            {3,4}
        };
        int[][] b= {
            {5,6},
            {7,8}
        };
        int[][] c = new int[2][2];
        for(int i=0; i<2; ++i) {
            for(int j=0; j<2; ++j) {
                int sum = 0;
                System.out.print("Calculate c[" + i + "][" + j + "]: ");
                int[] temp = new int[2];
                for(int k=0; k<2; ++k) {
                    int curr = a[i][k]*b[k][j];
                    sum += curr;
                    temp[k] = curr;
                    if(k != 0)
                        System.out.print(" + ");
                    System.out.print(a[i][k] + "*" + b[k][j]);
                }
                System.out.println(" = " + temp[0] + " + " + temp[1] + " = " + sum);
                c[i][j] = a[i][0]*b[0][j]+a[i][1]*b[1][j];
            }
        }

        for(int i=0; i<2; ++i){
            for(int r : c[i]){
                System.out.print(r + " ");
            }
            System.out.println();
        }
        //因為nested loop 分別為for(int i=0; i<2; ++i) for(int j=0; j<2; ++j) for(int k=0; k<2; ++k)
        //因此Big-O 為O(n^3)
    }
}