import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int a = 0, b = 1, c = 0;
        for(int i=2; i<=n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        if(n == 0) System.out.println("Term = " + a);
        else System.out.println("Term = " + b);
        sc.close();
    }
}
