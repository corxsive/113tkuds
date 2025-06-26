import java.util.*;

public class ds_05 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for(int el : arr) {
            sum += el;
        }
        System.out.println("Total sum from 1 to 10 = " + sum);
    }
}