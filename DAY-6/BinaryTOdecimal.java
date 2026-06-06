import java.util.Scanner;

public class BinaryTOdecimal {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        String bin = sc.next();
        int dec = 0;

        for(int i=0; i<bin.length(); i++) {
            char c = bin.charAt(bin.length()-1-i);
            if(c == '1') {
                dec = dec + (int)Math.pow(2, i);
            }
        }

        System.out.println("Decimal = " + dec);
        sc.close();
    }
    
}
