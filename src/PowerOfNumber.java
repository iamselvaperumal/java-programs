import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter The Number:");
        int a = Scanner.nextInt();
        System.out.println("Enter The Power:");
        int b = Scanner.nextInt();
        double c = 0;
        c = Math.pow(a,b);
        System.out.println("The Power\\^^ Of Given Number Is:" +c);

        String day = "sun";
        switch (day) {
            case "mon", "tue", "wed", "thur", "fri" -> System.out.println("Working days");
            case "sat", "sun" -> System.out.println("Holidays");
            default -> System.out.println("Enter a valid day");
        }
    }
}
