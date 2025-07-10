import java.util.*;

class LinearSearchDemoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[6];
        for(int i=0; i<6; ++i) {
            System.out.println("Enter Number " + (i+1) + ": ");
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter the target: ");
        int target = sc.nextInt();

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