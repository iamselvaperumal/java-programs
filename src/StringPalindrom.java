import java.util.Scanner;

public  class StringPalindrom {
    static boolean ispalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) == input.charAt(end)) {
                start++;
                end--;

            } else {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        Scanner testing3 = new Scanner(System.in);
        System.out.println("Enter The Word ");
        String a = testing3.next();

        System.out.println("The palindrome is " + ispalindrome(a));
    }
}
