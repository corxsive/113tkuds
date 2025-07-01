import java.util.*;

public class binary_search_trace {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,13};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to search");
        int pointer = sc.nextInt();
        int l = 0, r = arr.length - 1;
        while(l <= r) {
            int mid = (l + r) / 2;
            System.out.println("Search Area: left = " + l + ", right = " + r + ", mid = " + mid + " => arr[mid] = " + arr[mid]);
            if(arr[mid] == pointer) {
                System.out.println("founded");
                break;
            }
            if(arr[mid] < pointer) {
                l = ++mid;
            } else {
                r = --mid;
            }
        }
        //線性搜尋Big-O為O(n) 此Big-O為O(lg n)
    }
}