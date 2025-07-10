import java.util.*;

class LinearSearchDemo {
    public static void main(String[] args) {
        int[] numbers = {64,25,12,22,11,90,22,15};
        int target = 22;

        System.out.println("Linear Search");
        int result = linearSearch(numbers, target);
        System.out.println("Found at index " + result);
    }

    public static int linearSearch(int[] numbers, int target){
        for(int i=0; i<numbers.length; ++i) {
            System.out.println("Compare #" + (i+1) + ": array[0] = " + numbers[i] + ", target = " + target);
            if(numbers[i] == target) {
                System.out.println("Target found, total count " + (i+1));
                return i;
            }
        }
        return -1;
    }
}