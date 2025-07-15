import java.util.*;
import static java.lang.Math.*;
public class Q7_DailyPowerReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int[] input = Arrays.stream(line.split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        StringBuilder sb = new StringBuilder("");
        for (int i = input.length - 1; i >= 0; --i) {
            sb.append(input[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}