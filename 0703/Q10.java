import java.util.*;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int num1 = Integer.parseInt(line.split(" ")[0]);
        int num2 = Integer.parseInt(line.split(" ")[1]);
        System.out.println(num1 / num2);
    }
}