public class Operators {
    public static void main(String[] args) {
        int x = 30;
        int y = 40;

        // Arithmetic Operators
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(y / x);
        System.out.println(x % y);
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(y--);
        System.out.println(--y);

        // Assignment Operators
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println( x += y); // x = x + y
        System.out.println(x -= y);
        System.out.println(x *= y);
        System.out.println(x /= y);

        // Comparison Operator
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x >= y);
        System.out.println(x <= y);

        // Logical Operators
        System.out.println(x >= 30 && y >= 40);
        System.out.println(x >= 30 || y >= 60);

    }
}
