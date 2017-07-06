import java.util.Scanner;

/**
 * Created by jenny on 7/6/2017.
 */
public class ArrayChallenge2 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int sum = 0;

        System.out.print("Please enter number of rows: ");
        int rows = entry.nextInt();

        System.out.print("Please enter number of columns: ");
        int columns = entry.nextInt();

        int[][] array = new int[rows][columns];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                System.out.printf("Please enter an integer for row %d column %d:    ", i, j);
                array[i][j] = entry.nextInt();

                if (i == 0 || i == (rows - 1)) {
                    sum += array[i][j];
                } else {
                    if (columns % 2 != 0) {
                        if (j == columns / 2) {
                            sum += array[i][j];
                        } else {
                        }
                    } else {
                        if ((j == columns / 2) || (j == (columns / 2) + 1)) {
                            sum += array[i][j];
                        }
                    }
                }
            }
        }
        for (int k = 0; k < array.length; k++) {
            for (int l = 0; l < array[k].length; l++) {
                System.out.print(array[k][l] + "  " );
            }
            System.out.println();
        }

        System.out.println("Hourglass sum is " + sum);
    }
}

