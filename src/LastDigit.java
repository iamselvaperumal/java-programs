import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter The Number-");
        int number = Scanner.nextInt();

        //Find Last Digit Using Modulo Operator
        int lastdigit = number % 10;
        System.out.println("The Last Digit Is-"+lastdigit);
    }
}
