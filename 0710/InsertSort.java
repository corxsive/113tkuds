import java.util.*;

class InsertSort {
    public static void main(String[] args) {
        int[] numbers1 = {64, 34, 25, 12, 22, 11, 90};
        int[] numbers2 = numbers1.clone();

        System.out.println("Original numbers1[] = " + Arrays.toString(numbers1));
        Insertsort(numbers1);
        System.out.println("Insertsort output = " + Arrays.toString(numbers1));

        System.out.println("Original numbers2[] = " + Arrays.toString(numbers2));
        BinaryInsertSort(numbers2);
        System.out.println("BinaryInsertSort output = " + Arrays.toString(numbers2));
        
    }

    public static void BinaryInsertSort(int[] arr) {
        for(int i=1; i<arr.length; ++i) {
            int key = arr[i];
            int pos = bsInsert(arr,0,i-1,key);
            for(int j=i; j>pos; --j) {
                arr[j] = arr[j-1];
            }
            arr[pos] = key;
        }
    }

    public static int bsInsert(int[] arr, int l, int r, int k) {
        while(l<=r) {
            int m = l + (r-l) / 2;
            if(arr[m] <= k) {
                l = ++m;
            } else {
                r = --m;
            }
        }
        return l;
    }

    public static void Insertsort(int[] arr) {
        for(int i=1; i<arr.length; ++i) {
            int curr = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > curr) {
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1] = curr;
        }
    }
}