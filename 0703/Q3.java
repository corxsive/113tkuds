import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String nums[] = line.split("\\+");
        int total = 0;
        for(String num : nums) {
            total += Integer.parseInt(num);
        }
        System.out.println(total);
    }
}