package JavaLearn;

public class NestedForLoop {

    // Example of nested for loop with 2D matrix.
    public static void main(String[] args) {
        int[][] matrix = {
                {8, 1, 6},
                {3, 5, 7},
                {4, 9, 0},
        };
        //output the numbers
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++)

                System.out.print(matrix[i][j] + " ");

            System.out.println();  // print != println
            /* Outputs:  8 1 6
                         3 5 7
                         4 9 0 */
        }
    }
}
