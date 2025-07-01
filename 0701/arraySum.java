import java.util.*;

public class arraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,3,5,7,9};
        int total = 0;
        for(int i : arr) {
            total += i;
        }
        System.out.println(total);
    }
}