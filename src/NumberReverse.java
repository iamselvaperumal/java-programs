import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {
        Scanner Scnner = new Scanner(System.in);
        System.out.println("Enter The Number-");
        int number = Scnner.nextInt();

        int reverse = 0;
        while (number>0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
            System.out.println("The Reversed Number Is-"+reverse);
        }
    }
}
