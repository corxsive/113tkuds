public class FactorialExample {
    
    public static int factorial(int n) {
        // 停止條件：0! = 1, 1! = 1
        if (n <= 1) {
            System.out.print("1");
            return 1;
        }
        // 遞迴關係：n! = n × (n-1)!
        System.out.print(n + " * ");
        return n * factorial(n - 1);
    }
    
    public static void main(String[] args) {
        System.out.print("3! = ");
        System.out.println(" = " + factorial(3));
        System.out.print("5! = ");
        System.out.println(" = " + factorial(5));
        System.out.print("0! = ");
        System.out.println(" = " + factorial(0));
    }
}
