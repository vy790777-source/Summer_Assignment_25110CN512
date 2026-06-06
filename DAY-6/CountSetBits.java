import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int count = 0;

        while(n > 0) {
            if(n % 2 == 1) {
                count++;
            }
            n = n / 2;
        }

        System.out.println("Set bits = " + count);
        sc.close();
    }
}
