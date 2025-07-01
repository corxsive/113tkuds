import java.util.*;

public class array_mode_count {
    public static void main(String[] args) {
        int[] arr = {3,7,3,1,1,1};
        int max = -1;
        int maxValue = -1;
        for(int i=10; i>0; --i) {
            int total = 0;
            for(int j=0; j<arr.length;++j) {
                if(arr[j] == i) {
                    ++total;
                }
            }
            if(total > 0) {
                System.out.println("Comparing: " + i + " count was " + total);
                if(total > max) {
                    max = total;
                    maxValue = i;
                }
            }
        }
        System.out.println("maximum count of it is " + maxValue);
    }
    //此作法的時間複雜度為 O(n²)，可改善 =>array_mode_count_1.java
}