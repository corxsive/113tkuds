import java.util.*;

public class matrixMultiply {
    public static void main(String[] args) {
        int[][] arr1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] arr2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] result = new int[3][3];
        for(int i=0; i<3; ++i) {
            for(int j=0; j<3; ++j) {
                int sum = 0;
                System.out.println("Calculate c[" + i + "][" + j + "]");
                for(int k=0; k<3; ++k) {
                    sum += arr1[k][i] * arr2[j][k];
                    System.out.println("a["+k+"]["+i+"] * b["+j+"]["+k+"] = "+arr1[k][i]+" * " + arr2[j][k] + " = " + arr1[k][i] * arr2[j][k]);
                }
                result[i][j] = sum;
                System.out.println();
            }
        }

        for(int i=0; i<3; ++i){
            for(int r : result[i]){
                System.out.print(r + " ");
            }
            System.out.println();
        }
    }
}