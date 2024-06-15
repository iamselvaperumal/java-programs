import java.util.Scanner;

public class DivisersOfNumber {
    public static void main(String[] args) {
        Scanner Scnner = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int a = Scnner.nextInt();

       int count = 0;
          for (int i = 1; i < a; i++) {

            count++;

            if (a % i == 0) {

                System.out.println("The Divider Is :" +count);

        }
    }
}
}


