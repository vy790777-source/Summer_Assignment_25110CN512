import java.util.Scanner;

public class ArmstrongFunction {
    static boolean isArmstrong(int n) {
        int sum = 0, temp = n;
        while(n > 0) {
            int d = n % 10;
            sum = sum + d*d*d;
            n = n / 10;
        }
        return temp == sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isArmstrong(num))
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}
