import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int temp = n, sum = 0;

        while(temp != 0) {
            int digit = temp % 10;
            sum = sum + (digit * digit * digit);
            temp = temp / 10;
        }

        if(sum == n)
            System.out.println(n + " is Armstrong");
        else
            System.out.println(n + " is not Armstrong");
        sc.close();
    }
}
