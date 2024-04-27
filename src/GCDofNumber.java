import java.util.Scanner;

public class GCDofNumber {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter The Number1 :");
        int a = Scanner.nextInt();
        System.out.println("Enter The Number2 :");
        int b = Scanner.nextInt();
        int gcd = 1;
        for (int i = 1; i <=a && i <=b ; i++) {

            //check divides both a and b
            if (a % i == 0 && b % i == 0)
                gcd = i;

            System.out.println(gcd);

        }
    }
}
