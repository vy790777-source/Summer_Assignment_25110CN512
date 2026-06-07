import java.util.Scanner;

public class RecReverse {
    static int rev(int n, int r) {
        if(n == 0)
            return r;
        else
            return rev(n / 10, r * 10 + (n % 10));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.println("Reverse = " + rev(num, 0));
        sc.close();
    }
}
