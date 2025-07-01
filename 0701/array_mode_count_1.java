import java.util.*;

public class array_mode_count_1 {
    public static void main(String[] args) {
        int[] arr = {3,7,3,1,1,1};
        int[] memoize = new int[10];
        Arrays.fill(memoize, 0);
        for(int i: arr) {
            memoize[i] += 1;
        }
        int max = -1;
        int maxValue = -1;
        for(int i=0; i<memoize.length; ++i) {
            if(memoize[i] != 0) 
                System.out.println("number " + i + " has " + memoize[i] + " count");
            if(max < memoize[i]) {
                max = memoize[i];
                maxValue = i;
            }
        }
        System.out.println("maximum count was " + maxValue);
    }
}