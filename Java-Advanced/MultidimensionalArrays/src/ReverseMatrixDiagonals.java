import java.util.Arrays;
import java.util.Scanner;

public class ReverseMatrixDiagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        scanner.nextLine();

        int[][] matrix = new int[rows][cols];

        for (int r = 0; r < rows; r++) {
            matrix[r] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

        }

        int row = rows - 1;
        int col = cols - 1;


        while (row >= 0){

            int currentRow = row;
            int currentCol = col;

            while (currentCol < cols && currentRow >= 0){

                System.out.print(matrix[currentRow--][currentCol++] + " ");

            }
            System.out.println();

            col--;

            if (col == -1){
                col = 0;
                row--;
            }

        }

    }
}
