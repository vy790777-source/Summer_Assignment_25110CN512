import java.util.Scanner;

public class MaxFunction {
    static int max(int a, int b) {
        if(a > b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        int result = max(x, y);
        System.out.println("Maximum = " + result);
    }
}
