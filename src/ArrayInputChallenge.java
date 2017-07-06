import java.util.Scanner;

/**
 * Created by jenny on 7/6/2017.
 */
public class ArrayInputChallenge {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int sum = 0;

        int[][] array = new int[3][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                System.out.printf("Please enter an integer for row %d column %d:    ", i, j);
                array[i][j] = entry.nextInt();

                sum += array[i][j];

            }
        }
        System.out.println();

        sum = sum - (array[1][0] + array[1][2]);
        System.out.println("Hourglass sum is " + sum);
   }
}
