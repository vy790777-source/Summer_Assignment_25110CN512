import java.util.Scanner;

public class ProductDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int product = 1;

        while(n != 0) {
            product = product * (n % 10);
            n = n / 10;
        }

        System.out.println("Product of digits = " + product);
        sc.close();
    }
}
