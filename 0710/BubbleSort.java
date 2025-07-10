import java.util.*;

class BubbleSort {
    public static void main(String[] args) {
        int[] numbers1 = {64, 34, 25, 12, 22, 11, 90};
        int[] numbers2 = numbers1.clone();

        System.out.println("Original numbers1[] = " + Arrays.toString(numbers1));
        Bubblesort(numbers1);
        System.out.println("Bubblesort output = " + Arrays.toString(numbers1));

        System.out.println("Original numbers2[] = " + Arrays.toString(numbers2));
        Cocktailsort(numbers2);
        System.out.println("cocktail output = " + Arrays.toString(numbers2));
        
    }

    public static void Cocktailsort(int[] arr) {
        int l = 0, r = arr.length - 1;
        while(l < r) {
            for(int i=l; i<r; ++i) {
                if(arr[i] > arr[i+1]){
                    int temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                }
            }
            --r;
            for(int i=r; i>l; --i) {
                if(arr[i] < arr[i-1]){
                    int temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;
                }
            }
            ++l;
        }
    }

    public static void Bubblesort(int[] arr) {
        for(int i=0; i<arr.length - 1; ++i) {
            for(int j=i+1; j<arr.length; ++j) {
                if(arr[i] >= arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}