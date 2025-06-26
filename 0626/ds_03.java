import java.util.*;

public class ds_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name");
        String s1 = sc.nextLine();
        System.out.println("What is your age");
        String s2 = sc.nextLine();
        System.out.println("Where do you living at");
        String s3 = sc.nextLine();
        System.out.println("Hi " + s1 + ", " + s2 + " years old, living at " + s3);
    }
}