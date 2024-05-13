import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter The Number ");
        int a = scn.nextInt();

        double c = 0;
        c = Math.sqrt(a);
        System.out.println("The Square Is "+c);
    }

}
