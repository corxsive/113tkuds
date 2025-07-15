import java.util.*;
import static java.lang.Math.*;
public class Q10_ArrayToStringUtil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String line = sc.nextLine();
        int[] input = Arrays.stream(line.split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        String result = arrayToString(input);
        System.out.println(result);
    }
    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; ++i) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}