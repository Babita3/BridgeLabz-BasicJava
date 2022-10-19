package Day4_problems;
import java.net.SocketOption;
import java.util.*;
public class TwoDArray {
    public static void main(String[] args) {
        // Auto-generated main method stub

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row = sc.nextInt();
        System.out.println("Enter number of columns");
        int column = sc.nextInt();

        int arr[][] = new int[row][column];

        System.out.println("Enter elements of array");
        System.out.print("Enter " + row * column + " Elements to Store in Array :\n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i] [j] + " ");
            }
System.out.println();
            
        }
    }
}