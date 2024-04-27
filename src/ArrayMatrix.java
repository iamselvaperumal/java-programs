public class ArrayMatrix {
    public static void main(String[] args) {
        int matrix[][] = {
                {3, 6, 8},
                {5, 7, 8},
                {9, 5, 3}};

            System.out.println("sum of the column");
            for (int i = 0; i < matrix[0].length; i++) {
                int sum = 0;
                for (int j = 0; j < matrix.length; j++) {
                    sum = sum + matrix[j][i];
                    System.out.println("sum of " + (i + 1) + " column is :" + sum);
                    System.out.println();
                }
            }

        }
    }