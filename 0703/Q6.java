import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int num1 = Integer.parseInt(line.split(" ")[0]);
        double num2 = Double.parseDouble(line.split(" ")[1]);
        System.out.println(num1 + num2);
    }
}