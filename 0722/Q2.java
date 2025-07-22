import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int[] arr2 = {1,2,3,4,5,6,8,7};
        System.out.println(isSorted(arr, arr.length) ? "Yes" : "No");
        System.out.println(isSorted(arr2, arr2.length) ? "Yes" : "No");
    }
    public static boolean isSorted(int [] arr, int index) {
        int curr = -1;
        for(int i=0; i<index; ++i) {
            if(arr[i] > curr) {
                curr = arr[i];
            } else {
                return false;
            }
        }
        return true;
    }
}