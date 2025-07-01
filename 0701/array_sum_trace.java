import java.util.*;

public class array_sum_trace {
    public static void main(String[] args) {
        int[] arr = {1,3,5};
        int total = 0;
        for(int i: arr) {
            System.out.println("total = " + total + " + " + i + " = " + (total + i));
            total += i;
        }
        //Big-O =  O(n)
        System.out.println("total is " + total);
    }
}