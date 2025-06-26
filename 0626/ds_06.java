import java.util.*;
import java.math.*;
public class ds_06 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i=0; i<10; ++i) {
            arr[i] = (int)(Math.random()*100);
        }
        int max = -1;
        for(int el : arr) {
            //output all element
            System.out.print(el + " ");
            if(el > max) max = el;
        }
        System.out.println("\nMaximum value in the array is " + max );
    }
}