import java.util.*;

public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        line = sc.nextLine();
        String[] split = line.split(" ");
        int min = Integer.parseInt(split[0]), max = min;
        for(String s : split) {
            int curr = Integer.parseInt(s);
            if(curr < min)
                min = curr;
            if(curr > max)
                max = curr;
        }
        System.out.println(max + " " + min);
    }
}