package Day3_problems;
import java.util.Arrays;
public class ArraySort {
    public static void main(String[] args) {
            int[] a = {11,22,33,44,45,46,48,55};

            Arrays.sort(a);

            System.out.println("The element of array in ascending order are is ");

            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }

