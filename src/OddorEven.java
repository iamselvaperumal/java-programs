import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("enter the number-");
        long number = Scanner.nextLong();
        if (number % 2 == 0)
            System.out.println("the given is even");
        else
            System.out.println("the given is odd");
    }
}
