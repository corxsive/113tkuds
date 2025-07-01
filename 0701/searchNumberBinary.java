import java.util.*;

public class searchNumberBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,3,5,7,9,11,13};
        System.out.println("Enter the number to compare");
        int target = sc.nextInt();
        int l = 0, r = arr.length - 1;
        while(l <= r) {
            int mid = (l + r) / 2;
            System.out.println(mid);
            if(arr[mid] == target) {
                System.out.println(target + " == " + arr[mid]);
                break;
            }
            if(arr[mid] < target) {
                l = ++mid;
            } else {
                r = --mid;
            }
        }

        // for(int i : arr) {
            // System.out.println(target + (target == i ? " == " : " != ") + i);
        // }
    }
}