import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Input rows: ");
		int rows = sc.nextInt();
		System.out.println("Columns must be the same count as the rows!");
		System.out.print("Input columns: ");
		int columns = sc.nextInt();

		if (rows != columns) {

			System.out.println("ERROR");
		} else {

			int[][] matrix = new int[rows][columns];

			System.out.println("Input sqare matrix: ");
			for (int row = 0; row < rows; row++) {

				for (int col = 0; col < columns; col++) {

					System.out.print("matrix[" + row + "][" + col + "] = ");
					matrix[row][col] = sc.nextInt();
				}
			}

			System.out.print("Main diagonal: ");

			int col1 = 0;

			for (int row = 0; row < rows; row++) {

				System.out.print(matrix[row][col1] + " ");
				col1++;
			}

			System.out.println();

			System.out.print("Second diagonal: ");

			int col2 = columns - 1;
			for (int row = 0; row < rows; row++) {

				System.out.print(matrix[row][col2] + " ");
				col2--;
			}
		}
	}
}
/// A task with matrix
