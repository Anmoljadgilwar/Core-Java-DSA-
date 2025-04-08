
import java.util.Scanner;

public class TwoDArray2 {

    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);

        System.out.println("Enter no. of rows ");
        int rows = ob.nextInt();

        System.out.println("Enter no. of colums ");
        int colums = ob.nextInt();

        int matrix[][] = new int[rows][colums];

        //input rows
        System.out.println("Enter the elements in matrix for ");
        for (int i = 0; i < rows; i++) {
            //input colums
            for (int j = 0; j < colums; j++) {
                matrix[i][j] = ob.nextInt();
            }

        }
        System.out.println();
        //output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
