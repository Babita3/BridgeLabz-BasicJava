package Day3_problems;
import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5};
            reverse(numbers);
        }
        public static void reverse(int[] array)
        {
            System.out.println("Array = " + Arrays.toString(array));
            int maxIndex = array.length - 1;
            int halfLength = array.length / 2;
            for (int i = 0; i < halfLength; i++) {
                int temp = array[i];
                array[i] = array[maxIndex - i];
                array[maxIndex - i] = temp;
            }
            System.out.println("Reversed array = " + Arrays.toString(array));
        }
    }

