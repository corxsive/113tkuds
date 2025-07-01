import java.util.*;

public class linear_search_trace {
    public static void main(String[] args) {
        int[] s = {1,3,5,7,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to search");
        int target = sc.nextInt();
        for(int i: s) {
            System.out.println("Comparing: " + target + " vs " + i);
            if(target == i) {
                System.out.println("Found");
                break;
            }
        }
    }
}