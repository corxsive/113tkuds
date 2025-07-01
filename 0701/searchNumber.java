import java.util.*;

public class searchNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,3,5,7,9};
        System.out.println("Enter the number to compare");
        int target = sc.nextInt();
        for(int i : arr) {
            System.out.println(target + (target == i ? " == " : " != ") + i);
        }
    }
}