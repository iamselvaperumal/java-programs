import java.util.Scanner;

public class NumberLength {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter Your Number-");
        int number = Scanner.nextInt();
        Scanner.close();
            int count = 0;
            //To Count The Number

       while (number>0) {
           number = number / 10;
           count++;
       }
        System.out.println("The Count Is-" +count);
    }
}

